package ANAT;

import java.io.*;
import java.util.*;

public class Student extends User implements CanBeResearcher{
    private static final long serialVersionUID = 1L;
	private String entranceYear;
    private Faculty faculty;
    private double GPA; 
    private Vector<?> courses;
    private Major major;
    private final static int creditLimit = 21;
    private Degree degree;
    
    private Hashtable<Course,Journal> journals;
    private Vector<Lesson> schedule; //Schedule of student
    private Transcript transcript;
    
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
    public String getEntranceYear() {
        return this.entranceYear;
    }
    public void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }
    public Faculty getFaculty() {
        return this.faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public Vector getCourses() {
        return this.courses;
    }
    public void setCourses(Vector courses) {
        this.courses = courses;
    }
    public Major getMajor() {
        return this.major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    public int getCreditLimit() {
        return this.creditLimit;
    }
    public Degree getDegree() {
        return this.degree;
    }
    public void setDegree(Degree degree) {
        this.degree = degree;
    }
    
    public void setSchedule( Vector<Lesson> lessons){
    	this.schedule = lessons;
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
    
    //Show list of lessons, which student has
    public void viewSchedule() {
        for(Lesson lesson:schedule) {
        	System.out.println(lesson.toString());
        }
    }
    
    public void viewTranscript() {
        //TODO
    }
    
    //Here we go through all courses and checking if there any attendance
    public void doAttendance() {
    	Enumeration<Course> e = journals.keys();
        while (e.hasMoreElements()) {
            Course key = e.nextElement();
            checkAttendance(journals.get(key));
        }
    }
    //Here student can check if there are any attendance, then do attendance
    private void checkAttendance(Journal journal) {
        Vector<Lesson> attLessons = journal.getTimerAttendance();
        if(!attLessons.isEmpty()) {
        	for(Lesson lesson:attLessons) {
        		journal.setAttendance(lesson, Attendance.Attended);
        	}
        }
    }
    
    //Here teachers can do attendance for student (Absent or Late)
    public void doAttendance(Lesson lesson,Attendance att) {
    	journals.get(lesson.getCourse()).setAttendance(lesson, att);
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
//    	 super.showBasicInterface();
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
