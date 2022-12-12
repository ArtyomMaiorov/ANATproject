package ANAT;

import java.util.Scanner;

public class Student extends User implements Comparator<Student>, CanBeResearcher {
    private String entranceYear;
    private Faculty faculty;
    private double GPA; 
    private Vector courses;
    private Major major;
    private final static int creditLimit = 21;
    private Degree degree;
   
  //getter/setter
    private String getEntranceYear() {
        return this.entranceYear;
    }
    private String setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }
    private Faculty getFaculty() {
        return this.faculty;
    }
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    private double getGPA() {
        return this.GPA;
    }
    private double setGPA(Real GPA) {
        this.GPA = GPA;
    }
    private Vector getCourses() {
        return this.courses;
    }
    private Vector setCourses(Vector courses) {
        this.courses = courses;
    }
    private Major getMajor() {
        return this.major;
    }
    private Major setMajor(Major major) {
        this.major = major;
    }
    private int getCreditLimit() {
        return this.creditLimit;
    }
    private Degree getDegree() {
        return this.degree;
    }
    private Degree setDegree(Degree degree) {
        this.degree = degree;
    }
    //                          Operations                                  
    
    public boolean registerToCourse() {
        //TODO
        return false;
    }
      
    public void viewInfoAboutTeacher(Teacher teacher) {
        //TODO
    }   
    public void viewMarks() {
        //TODO
    }
    
    public void rateTeacher() {
        //TODO
    }
    
    public void getTranscript() {
        //TODO
    }
    
    public void viewStudentOrganizations() {
        //TODO
    }
    
    public boolean dropCourse() {
        //TODO
        return false;
    }
   
    public void viewCourses() {
        //TODO
    }
 
    public void viewSchedule() {
        //TODO
    }
    
    public void viewTranscript() {
        //TODO
    }
    
    public void viewAttendance() {
        //TODO
    }
   
    public void viewExamSchedule() {
        //TODO
    }
    
    public void viewAttestation() {
        //TODO
    }
    
    public void countGPA() {
    	 //TODO
    }
    
    public boolean joinOrganization(Organization organization) {
        //TODO
        return false;
    }
    
    public void showInterface() {
    	 super.showInterface();
    	 while(true) {
            System.out.println("Enter number(S to stop choosing) (Student): ");
            System.out.println("1.register To Course");
            System.out.println("2.view Info About Teacher");
            System.out.println("3.view Marks");
            System.out.println("4.rate Teacher");
            System.out.println("5.get Transcript");
            System.out.println("6.view Student Organizations");
            System.out.println("7.drop Course");
            System.out.println("8.view Courses");
            System.out.println("9.view Schedule");
            System.out.println("10.view Transcript");
            System.out.println("11.view Attendance");
            System.out.println("12.view Exam Schedule");
            System.out.println("13.view Attestation");
            System.out.println("14.count GPA");
            System.out.println("15.join Organization");
            Scanner input = new Scanner(System.in);
            String s = input.next();
            if(s.equals("S")) {
               System.exit(0);
            }
            else 
            {
                //TODO
            }
    	  }
      }
    
}
