package ANAT;

import java.io.IOException;

public class DriverClass {
	public static void main(String[] args) throws IOException {
		Student Artyom = new Student();
		System.out.println(Artyom);
		Database db = Database.getInstance();
		db.addStudent(Artyom);
		db.saveToFile();
	}
}