package ANAT;
public class FacultyComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.faculty.compareTo(o2.faculty);
     }
}
