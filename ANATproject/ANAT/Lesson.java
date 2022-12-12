package ANAT;

import java.util.Date;
import java.util.Vector;

/**
* @generated
*/
public class Lesson {
    
    /**
    * @generated
    */
    private int id;
    
    /**
    * @generated
    */
    private Course course;
    
    /**
    * @generated
    */
    private Date dateTime;
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Room room;

    private Vector students;
   
    public int getId() {
        return this.id;
    }
  
    public void setId(Integer id) {
        this.id = id;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    /**
    * @generated
    */
    public Date getDateTime() {
        return this.dateTime;
    }
    
    /**
    * @generated
    */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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
    public Room getRoom() {
        return this.room;
    }
    
    /**
    * @generated
    */
    public void setRoom(Room room) {
        this.room = room;
    }
   
    /**
    * @generated
    */
    private Vector getStudents() {
        return this.students;
    }
    
    /**
    * @generated
    */
    private void setStudents(Vector students) {
        this.students = students;
    }
    

    
 
  
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean deleteLesson() {
        //TODO
        return false;
    }
    
    
}
