package ANAT;

import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
    private String nameOfCourse;
    private String courseID;
    private Vector<Teacher> teachers;
    private int credits;
    private Vector<Lesson> schedule;
    private Vector<Student> students;
    
    
    public String getNameOfCourse() {
        return this.nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public Vector<Teacher> getTeachers() {
        return this.teachers;
    }

    public void setInstructors(Vector<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public int getCredits() {
        return this.credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    public Vector<Lesson> getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Vector<Lesson> schedule) {
        this.schedule = schedule;
    }


    public Vector<Student> getStudents() {
        return this.students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
    
    

    //                          Operations                                  

    public String toString() {
        return this.nameOfCourse;
    }

    public String viewInstructors() {
        //TODO
        return "";
    }

    public int hashCode() {
        //TODO
        return 0;
    }
    
    
}
