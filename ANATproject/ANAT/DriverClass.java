package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException, UnsuccessfulLoginException {
		boolean running = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Database db = Database.getInstance();
		db.loadDatabase();
		db = Database.getInstance();

		
		System.out.println(db.toString());
		
		while(running) {
			User user = Database.currentUser;

			if(user == null) {
				System.out.println("Enter username");
				String username = br.readLine();
				System.out.println("Enter password");
				String password = br.readLine();
				db.login(username, password);
				user = Database.currentUser;
			}
			user.showInterface();

		}
		db.saveDatabase();
		System.out.println(db.toString());
//		Student Artyom = new Student();
//		Database db = Database.getInstance();
//		
//		db.addUser(Artyom);
//		System.out.println(db.getAllStudents());
//		db.saveDatabase();
////		Database.loadDatabase();
//		System.out.println(Database.getInstance());
////		Database db = Database.getInstance();
////		Database.login("a", "a", 0);
//		((Student) Database.currentUser).showInterface();
//		Database.logout();
//		System.out.println(((Student) Database.currentUser));
//		System.out.println(db);
//		System.out.println(db.getAllStudents().toString());
////		Database.login("artmay", "123456f", 0);
//		Student S1 = new Student();
//		Student S2 = new Student();
//		System.out.println(S1);
//		S1.sendMessage(S2,"title", "smth");
//		S2.readMessages();
//		Manager m = new Manager();
//		m.addNews("Уважаемые читатели!", "С 4 ЯНВАРЯ 2018 ГОДА ВЗИМАЮТСЯ ШТРАФНЫЕ САНКЦИИ ЗА КАЖДЫЙ ДЕНЬ ЗАДЕРЖКИ ВОЗВРАТА КНИГ (100 тенге в день за одну книгу).");
//		m.addNews("ПАМЯТКА ПО ОПЛАТУ", "...");
//		
//		m.showNews();
//	}
}
}
