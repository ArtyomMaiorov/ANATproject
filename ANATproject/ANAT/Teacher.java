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
    	lesson.attendance(timer);
    }
    //if student was late, teacher can attend him like LATE
    public void attenedLateStudents(Student student,Lesson lesson) {
    	student.getJournal().setAttendance(lesson.getDateTime(), Attendance.Late);
    }
    
    public void putMark(Student student, Course course, Mark mark) {
    	Database db = Database.getInstance();
    	Student dbStudent = null;
    	Course dbCourse = null;
    	
    	for(Student s : db.getAllStudents()) {
    		if(s.equals(student)) {
    			dbStudent = s;
    			break;
    		}
    	}
    	for(Course c : db.getAllCourses()) {
    		if(c.equals(course)) {
    			dbCourse = c;
    			break;
    		}
    	}
    	if(dbStudent == null) System.out.println("Student not found");
    	else if (dbCourse == null) System.out.println("Course not found");
    	else {
    		dbStudent.addMark(mark);
    		System.out.println("Mark put successfully");
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
