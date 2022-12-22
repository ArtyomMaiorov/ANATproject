package ANAT;

import java.io.*;
import java.util.*;
public class Teacher extends Employee  {

	private static final long serialVersionUID = 8660076864903025466L;
    private TeacherTitle title;
    private double rating;
    
    private Vector<Lesson> lessons;
    
    public Teacher() throws IOException{
    	super();
    	InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter teacher's title");
		try {
			this.title = TeacherTitle.valueOf(br.readLine());	
		} catch (Exception e) {
			System.out.println("Wrong title");
		}
		this.rating = 0;
    }
    
    public TeacherTitle getTitle() {
        return this.title;
    }
    
    public void setTitle(TeacherTitle title) {
        this.title = title;
    }
    
    public double getRating() {
        return this.rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public void setLessons(Vector<Lesson> lessons) {
    	this.lessons = lessons;
    }
    public Vector<Lesson> getLessons() {
    	return this.lessons;
    }

    //                          Operations                                  
    
    //teacher can do attendance with timer choosing appropriate lesson
    public void doAttendance(Lesson lesson) {
    	int timer = 10;
    	lesson.attendance(lesson,timer);
    }
    //if student was late, teacher can attend him like LATE
    public void attenedLateStudents(Student student,Lesson lesson) {
    	student.doAttendance(lesson, Attendance.Late);
    }
    
    public void putMark(String studentID, String courseName, int mark) {
    	Database db = Database.getInstance();
    	Student dbStudent = null;
    	Course dbCourse = null;
    	
    	for(Student s : db.getAllStudents()) {
    		if(s.getID().equals(studentID)) {
    			dbStudent = s;
    			break;
    		}
    	}
    	for(Course c : db.getAllCourses()) {
    		if(c.getNameOfCourse().equals(courseName)) {
    			dbCourse = c;
    			break;
    		}
    	}
    	if(dbStudent == null) System.out.println("Student not found");
    	else if (dbCourse == null) System.out.println("Course not found");
    	else {
    		dbCourse.addMark(dbStudent, mark);
    		System.out.println("Mark put successfully");
    	}
    }
    
    public void showInterface() throws IOException {
   	 super.showBasicInterface();
   	 while(Database.currentUser!=null) {
           System.out.println("TEACHER PAGE\n Enter number (Q to stop choosing): ");
           System.out.println("1 - Go to User menu");
           System.out.println("2 - View Marks");
           System.out.println("4 - Put mark");
           System.out.println("5 - View Student Organizations");
           System.out.println("7 - Drop Course");
           System.out.println("8 - View Courses");
           System.out.println("9 - View Schedule");

           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String s = br.readLine();
           if(s.equalsIgnoreCase("Q")) {
              System.exit(0);
           }
           else 
           {
        	   if(s.equals("1")) this.showBasicInterface();
        	   if(s.equals("4")) {
        		   System.out.println("Enter student's id: ");
        		   String id = br.readLine();
        		   System.out.println("Enter the name of the course");
        		   String courseName = br.readLine();
        		   System.out.println("Which mark to put?");
        		   int m = Integer.parseInt(br.readLine());
        		   this.putMark(id, courseName, m);
                   Database.getInstance().saveDatabase();
        	   }
               
           }
   	  }
   }
    
    public void viewCourse() {
        //TODO
    }
    
    public String viewStudents() {
        //TODO
        return "";
    }
    
    public String viewTranscript() {
        //TODO
        return "";
    }

    public String toString() {
        return super.toString() + "\nTeacher title: " + title;
    }
    
    public Message sendMessage() {
        //TODO
        return null;
    }
   
    
    
}
