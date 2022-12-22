package ANAT;

import java.io.*;
import java.util.*;

public class Student extends User implements CanBeResearcher{
    private static final long serialVersionUID = 1L;
    private final static int creditLimit = 21;

    private Faculty faculty;
    private double GPA; 
    private Major major;
    private Degree degree;
    private int totalCredits = 0;
    private Hashtable<Course,Journal> journals;
    private Vector<Lesson> schedule; //Schedule of student
    private Transcript transcript;
    
    public Student() throws IOException {
    	super();
    	InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
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
    public Major getMajor() {
        return this.major;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    public int getCreditLimit() {
        return Student.creditLimit;
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
    
    
    
      
    public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
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
    
    public boolean registerForCourse(Course course) {
        this.totalCredits += course.getCredits();
        
        if(Manager.approveRegistration(this, course)) {
        	
        	course.getStudentsAndMarks().put(this, 0);
        }
        return false;
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
    
    public void showInterface() throws IOException {
    	 super.showBasicInterface();
    	 while(Database.currentUser!=null) {
            System.out.println("STUDENT PAGE\n Enter number (Q to quit): ");
            System.out.println("1 - Register For a Course");
            System.out.println("2 - View Marks");
            System.out.println("3 - Rate Teacher");
            System.out.println("4 - Get Transcript");
            System.out.println("5 - View Student Organizations");
            System.out.println("7 - Drop Course");
            System.out.println("8 - View Courses");
            System.out.println("9 - View Schedule");
            System.out.println("10 - View Transcript");
            System.out.println("11 - Count GPA");
            System.out.println("15 - Join Organization");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            if(s.equalsIgnoreCase("Q")) {
               System.exit(0);
            }
            else 
            {
                if(s.equals("1")) {
                	System.out.println("Here is a list of all available course: " + Database.getInstance().getAllCourses());
                	System.out.println("Which one do you want to register for?");
                	String enteredCourseName = br.readLine();
                	for(Course c : Database.getInstance().getAllCourses()) {
                		if(c.getNameOfCourse().equals(enteredCourseName)) {
                			this.registerForCourse(c);
                		}
                	}
                }
                
            }
    	  }
    }
    
    public String toString() {
    	return super.toString() + " First name:"+ super.getFirstName()+"Last name:"+super.getLastName()+"Faculty"+ this.getFaculty();
    }
    
}
