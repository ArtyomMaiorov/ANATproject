package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Student extends User implements Comparator<Student>, CanBeResearcher {
    private String entranceYear;
    private Faculty faculty;
    private double GPA; 
    private Vector courses;
    private Major major;
    private final static int creditLimit = 21;
    private Degree degree;
    
    public Student() throws IOException {
    	super();
    	InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter student's entrance year");
		this.entranceYear= br.readLine();
		System.out.println("Enter student's faculty");
		try {
			this.faculty = Faculty.valueOf(br.readLine());	
		} catch (Exception e) {
			System.out.println("Wrong faculty");
		}
		System.out.println("Enter student's degree");
		try {
			this.degree = Degree.valueOf(br.readLine());	
		} catch (Exception e) {
			System.out.println("Wrong degree");
		}
		System.out.println("Enter student's major");
		try {
			this.major = Major.valueOf(br.readLine());	
		} catch (Exception e) {
			System.out.println("Wrong major");
		}
    }
    
  //getter/setter
    private String getEntranceYear() {
        return this.entranceYear;
    }
    private void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }
    private Faculty getFaculty() {
        return this.faculty;
    }
    private void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    private double getGPA() {
        return this.GPA;
    }
    private void setGPA(double GPA) {
        this.GPA = GPA;
    }
    private Vector getCourses() {
        return this.courses;
    }
    private void setCourses(Vector courses) {
        this.courses = courses;
    }
    private Major getMajor() {
        return this.major;
    }
    private void setMajor(Major major) {
        this.major = major;
    }
    private int getCreditLimit() {
        return this.creditLimit;
    }
    private Degree getDegree() {
        return this.degree;
    }
    private void setDegree(Degree degree) {
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
    	 super.showBasicInterface();
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}