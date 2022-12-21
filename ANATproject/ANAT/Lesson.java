package ANAT;

import java.util.Date;
import java.util.Vector;

public class Lesson {
    
    private int id;    
    private Course course;    
    private Date dateTime; 
    private Teacher teacher;
    private Room room;
    
    private Vector<Student> students; //list of students, which should be in that lesson
    
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

    public Date getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    //                          Operations                                  
    
    // for all students from the list above, teacher can do attendance
    public void attendance(Lesson lesson ,double timer) {
    	for(Student student:students) {
    		student.doAttendance(lesson,Attendance.Absent);
    	}
    }
    public boolean deleteLesson() {
        //TODO
        return false;
    }
    
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson other = (Lesson) obj;
		return id == other.id && dateTime.equals(other.dateTime) && course.equals(other.course);
	}
    
    public String toString() {
    	return course.toString() + " (" + dateTime.getTime() + ")";
    }
    
}
