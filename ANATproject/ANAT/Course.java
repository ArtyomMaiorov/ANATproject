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
    
    
    private String getNameOfCourse() {
        return this.nameOfCourse;
    }

    private void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    private String getCourseID() {
        return this.courseID;
    }

    private void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    private Vector getInstructors() {
        return this.instructors;
    }

    private void setInstructors(Vector instructors) {
        this.instructors = instructors;
    }
    
    private int getCredits() {
        return this.credits;
    }

    private void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    private Vector getSchedule() {
        return this.schedule;
    }

    private void setSchedule(Vector schedule) {
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
