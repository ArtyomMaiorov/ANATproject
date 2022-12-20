package ANAT;

import java.io.Serializable;
import java.util.Vector;

/**
* @generated
*/
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;
    private String nameOfCourse;
    private String courseID;
    private Vector instructors;
    private int credits;
    private Vector schedule;
    private Teacher teacher;
    private Lesson lesson;
    private Student students;
    
    
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

    public Vector getInstructors() {
        return this.instructors;
    }

    public void setInstructors(Vector instructors) {
        this.instructors = instructors;
    }
    
    public int getCredits() {
        return this.credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    public Vector getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Vector schedule) {
        this.schedule = schedule;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public Lesson getLesson() {
        return this.lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Student getStudents() {
        return this.students;
    }

    public void setStudent(Student students) {
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
