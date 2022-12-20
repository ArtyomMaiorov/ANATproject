package ANAT;

import java.util.*;

public class Journal {
	
	private Hashtable<Date,Double> points; // points for a lesson
	private Hashtable<Date,Attendance> attendance; //table with dates when student attended and was absent or late
	private Vector<Date> availableAttendance; // Attendance, which has timer before it disappear (now it's not work)
	
	//date - in that dateTime, student get these points (Need to add for different courses)
	public double getPoint(Date date){
		return points.get(date);
	}
	public void setPoint(Date date, double point) {
		this.points.put(date, point);
	}
	
	// to see attendance in that date
	public Attendance getAttendance(Date date) {
		return attendance.get(date);
	}
	
	//here student can do attendance(Attended) or teacher can do attedance for students(Absent,Late or Attended)
	public void setAttendance(Date date,Attendance att) {
		this.attendance.put(date, att);
	}
	
	// Teacher do attendance with a timer, if student didn't attended, then he would be marked Absent
	public void setTimerAttendance(Date date) {
		this.availableAttendance.add(date);
	}
	
	//Student is able to check if there are any attendance, then will be able to do attendance
	public Vector<Date> getTimerAttendance() {
		return this.availableAttendance;
	}
	
}
