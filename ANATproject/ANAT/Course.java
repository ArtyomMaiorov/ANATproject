package ANAT;

import java.io.Serializable;
import java.util.Vector;

/**
* @generated
*/
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
    * @generated
    */
    private String nameOfCourse;
    
    /**
    * @generated
    */
    private String courseID;
    
    /**
    * @generated
    */
    private Vector instructors;
    
    /**
    * @generated
    */
    private int credits;
    
    /**
    * @generated
    */
    private Vector schedule;
    
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Lesson lesson;
    
    /**
    * @generated
    */
    private Student students;
    
  
    

    /**
    * @generated
    */
    private String getNameOfCourse() {
        return this.nameOfCourse;
    }
    
    /**
    * @generated
    */
    private void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }
    
    
    /**
    * @generated
    */
    private String getCourseID() {
        return this.courseID;
    }
    
    /**
    * @generated
    */
    private void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    
    
    /**
    * @generated
    */
    private Vector getInstructors() {
        return this.instructors;
    }
    
    /**
    * @generated
    */
    private void setInstructors(Vector instructors) {
        this.instructors = instructors;
    }
    
    
    /**
    * @generated
    */
    private int getCredits() {
        return this.credits;
    }
    
    /**
    * @generated
    */
    private void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    
    /**
    * @generated
    */
    private Vector getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    private void setSchedule(Vector schedule) {
        this.schedule = schedule;
    }
    
    
    
    /**
    * @generated
    */
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    /**
    * @generated
    */
    public Lesson getLesson() {
        return this.lesson;
    }
    
    /**
    * @generated
    */
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    
    /**
    * @generated
    */
    public Student getStudents() {
        return this.students;
    }
    
    /**
    * @generated
    */
    public void setStudent(Student students) {
        this.students = students;
    }
    
   
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public String toString() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String viewInstructors() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public int hashCode() {
        //TODO
        return 0;
    }
    
    
}
