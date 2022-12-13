package ANAT;

import java.util.Objects;
import java.util.Vector;

/**
* @generated
*/
public class Course {
    
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
    private Vector<Teacher> instructors;
    
    /**
    * @generated
    */
    private int credits;
    
    /**
    * @generated
    */
    private Vector<Lesson> schedule;
    
    
  
  
    /**
    * @generated
    */
    private Vector<Student> students;
   

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
    private Vector<Teacher> getInstructors() {
        return this.instructors;
    }
    
    /**
    * @generated
    */
    private void setInstructors(Vector<Teacher> instructors) {
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
    public Vector<Student> getStudents() {
        return this.students;
    }
    
    /**
    * @generated
    */
    public void setStudents(Vector<Student> student) {
        this.students = students;
    }
    
    
    
    

    //                          Operations                                  
    

    
   

	@Override
	public String toString() {
		return "Course [nameOfCourse=" + nameOfCourse + ", courseID=" + courseID + ", instructors=" + instructors
				+ ", credits=" + credits + ", schedule=" + schedule + ", students=" + students
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseID, credits, instructors, nameOfCourse, schedule, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseID, other.courseID) && credits == other.credits
				&& Objects.equals(instructors, other.instructors) && Objects.equals(nameOfCourse, other.nameOfCourse)
				&& Objects.equals(schedule, other.schedule) && Objects.equals(students, other.students);
	}
    
  
    
    
}
