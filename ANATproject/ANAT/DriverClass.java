package ANAT;

import java.io.IOException;

public class DriverClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException, UnsuccessfulLoginException {
//		Student Artyom = new Student();
//		Database db = Database.getInstance();
//		
//		db.addUser(Artyom);
//		System.out.println(db.getAllStudents());
//		db.saveDatabase();
		Database.loadDatabase();
		System.out.println(Database.getInstance());
		Database db = Database.getInstance();
		Database.login("a", "a", 0);
		((Student) Database.currentUser).showInterface();
		Database.logout();
		System.out.println(((Student) Database.currentUser));
		System.out.println(db);
		System.out.println(db.getAllStudents().toString());
		Database.login("artmay", "123456f", 0);
	}
}