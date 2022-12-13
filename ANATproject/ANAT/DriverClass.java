package ANAT;

import java.io.IOException;

public class DriverClass {
	public static void main(String[] args) throws IOException {
		
		Database db = Database.getInstance();
		db.addStudent(new Student());
		db.saveToFile();
		db.readFromFile("students.txt");
	}
}