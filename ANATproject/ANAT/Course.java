package ANAT;

import java.io.*;
import java.util.*;

public class Course implements Serializable, Comparable<Course>{
	private static final long serialVersionUID = 1L;
	
    private String nameOfCourse;
    private String courseID;
    private Vector<Teacher> teachers;
    private Faculty faculty;
    private int maxStudents;
    private int credits;
    private Vector<Lesson> schedule;
    private HashMap<Student, Mark> studentsAndMarks;
    
    {
    	this.studentsAndMarks = new HashMap<Student, Mark>();
    	this.schedule = new Vector<Lesson>();
    }
    private boolean isFull;

    public Course() throws IOException {
		this.isFull = studentsAndMarks.size() > maxStudents;

    	InputStreamReader r = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(r);
    	System.out.println("Enter course's faculty");
		try {
			this.faculty = Faculty.valueOf(br.readLine());	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Wrong faculty");
		}
		System.out.println("Enter course's name ");
		this.nameOfCourse = br.readLine();
		System.out.println("Enter course's id");
		this.courseID = br.readLine();
		System.out.println("Enter course capacity");
		this.maxStudents = Integer.parseInt(br.readLine());
		System.out.println("Enter course's credit");
		this.credits = Integer.parseInt(br.readLine());
    }
    
    public String getNameOfCourse() {
        return this.nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public boolean isFull() {
		return this.isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
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

    public HashMap<Student, Mark> getStudentsAndMarks() {
        return this.studentsAndMarks;
    }

    public void setStudents(HashMap<Student, Mark> studentsAndMarks) {
        this.studentsAndMarks = studentsAndMarks;
    }
    
    

    //                          Operations                                  
    public void addMark(Student student, Mark mark) {
    	this.studentsAndMarks.put(student, mark);
    }

    

    @Override
	public String toString() {
		return "Course [nameOfCourse=" + nameOfCourse + ", courseID=" + courseID + ", teachers=" + teachers
				+ ", faculty=" + faculty + ", maxStudents=" + maxStudents + ", credits=" + credits + ", schedule="
				+ schedule + ", studentsAndMarks=" + studentsAndMarks + ", isFull=" + isFull + "]";
	}

	public String viewInstructors() {
        //TODO
        return "";
    }

    public int hashCode() {
        //TODO
        return 0;
    }

	@Override
	public int compareTo(Course o) {
		if(this.studentsAndMarks.keySet().size()>o.studentsAndMarks.keySet().size())
			return 1;
		else if(this.studentsAndMarks.keySet().size()<o.studentsAndMarks.keySet().size())
			return -1;
		return 0;
	}
    
    
}
