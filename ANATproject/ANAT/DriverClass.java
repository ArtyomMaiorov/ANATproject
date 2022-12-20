package ANAT;

import java.io.IOException;

public class DriverClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException, UnsuccessfulLoginException {
		Database db = Database.getInstance();
//		Student Artyom = new Student();
//		db.addUser(Artyom);
//		System.out.println(db.getAllStudents());
//		db.saveDatabase();
		db.loadDatabase();
		System.out.println(db.getAllStudents());
//		db.login("artmay", "123456f", 0);
	}
}