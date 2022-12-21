package ANAT;

import java.util.Enumeration;
import java.util.Hashtable;

public class Transcript {
   
    public void getTranscript(Hashtable<Course,Journal> journals){
    	
    	Enumeration<Course> e = journals.keys();
        while (e.hasMoreElements()) {
            Course key = e.nextElement();
            double sum = journals.get(key).calculatePoints();
            System.out.println(key.toString() + " : " + sum + "  GPA: " + calculateGPA(key,sum));
        }
    }                                

    public double calculateGPA(Course course, double points) {
        double gpa = (points*course.getCredits())/course.getCredits();
        return gpa;
    }
    
    
}
