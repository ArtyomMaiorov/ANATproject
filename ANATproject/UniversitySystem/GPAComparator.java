package ANAT;
public class GPAComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.GPA.compareTo(o2.GPA);
     }   
}
