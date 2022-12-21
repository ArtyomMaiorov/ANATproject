package ANAT;

import java.util.Comparator;

public class FacultyComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getFaculty().compareTo(o2.getFaculty());
     }
}
