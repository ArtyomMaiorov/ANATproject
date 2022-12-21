package ANAT;

import java.util.*;

public class Journal {
	
	private Hashtable<Lesson,Double> points; // points for a lesson
	private Hashtable<Lesson,Attendance> attendance; //table with dates when student attended and was absent or late
	private Vector<Lesson> availableAttendance; // Attendance, which has timer before it disappear (now it's not work)
	
	//date - in that dateTime, student get these points (Need to add for different courses)
	public double getPoint(Lesson lesson){
		return points.get(lesson);
	}
	public void setPoint(Lesson lesson, double point) {
		this.points.put(lesson, point);
	}
	
	// to see attendance in that date
	public Attendance getAttendance(Lesson lesson) {
		return attendance.get(lesson);
	}
	
	//here student can do attendance(Attended) or teacher can do attedance for students(Absent,Late or Attended)
	public void setAttendance(Lesson lesson,Attendance att) {
		this.attendance.put(lesson, att);
	}
	
	// Teacher do attendance with a timer, if student didn't attended, then he would be marked Absent
	public void setTimerAttendance(Lesson lesson) {
		this.availableAttendance.add(lesson);
	}
	
	//Student is able to check if there are any attendance, then will be able to do attendance
	public Vector<Lesson> getTimerAttendance() {
		return this.availableAttendance;
	}
	
}
