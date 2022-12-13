package ANAT;


public class UserFactory {
	
	private Database database;
	public User createUser(UserType user) {
		
		if(user == null)return null;
		
		if(user == UserType.STUDENT)return new Student();
		
		if(user == UserType.TEACHER)return new Teacher();
		
		if(user == UserType.ADMIN)return new Admin();
		
		if(user == UserType.MANAGER)return new Manager();
		
		if(user == UserType.LIBRARIAN)return new Librarian();
		
		return null;
	}
	
    public int createUsers(Vector<UserType> list) {
		
		for(int i=0;i<list.size();i++) {
			database.addUser(createUser(list.get(i)));
		}
	}
}
