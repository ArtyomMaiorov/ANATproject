package ANAT;

import java.util.*;
import java.io.*;
public class Database implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Database dbObject;
	private TreeSet<Student> students;
	private TreeSet<Teacher> teachers;
    private HashSet<Admin> admins;
    private TreeSet<Manager> managers;  
    private TreeSet<Librarian> librarians;
    private TreeSet<Course> courses;
    private TreeMap<Student, Book> books;
    private TreeMap<User,String> logFiles; 
    
    private Vector<News> newsWall;//we can add/delete/update news and show them
    private Vector<Message> requests; //managers will be able to get all requests
    private Hashtable<Integer, LinkedList<Message>> messages; // by id of employee, we can get all messages which he/she/it retrieved
     
    {
    	students = new TreeSet<Student>();
    	messages = new Hashtable<Integer, LinkedList<Message>>();
    }
    
    
    public Database() {}
    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
           dbObject = new Database();
        }

         // returns the singleton object
         return dbObject;
     }
    
    
    //                          Operations  
    
    
    public void addMessage(int employeeID,Message message) {
    	//employeeID is receiver
    	messages.get(employeeID).offer(message);
    }
    
    public LinkedList<Message> getMessages(int employeeID) {
    	//employeeID is
    	return messages.get(employeeID);
    }
    
    public void addUser(User newUser) {
    	UserType user = newUser.getUserType();
    	
        if(user == UserType.STUDENT) setStudent((Student) newUser);		
        else if(user == UserType.TEACHER) setTeacher((Teacher) newUser);		
        else if(user == UserType.ADMIN) setAdmin((Admin) newUser);		
        else if(user == UserType.MANAGER) setManager((Manager) newUser);
		else if(user == UserType.LIBRARIAN) setLibrarian((Librarian) newUser);
        
    }
    public void setStudent(Student student) {
    	students.add(student);
    }
    public void setTeacher(Teacher teacher) {
    	teachers.add(teacher);
    }
    public void setManager(Manager manager) {
    	managers.add(manager);
    }
    public void setAdmin(Admin admin) {
    	admins.add(admin);
    }
    public void setLibrarian(Librarian librarian) {
    	librarians.add(librarian);
    }
    
    public boolean checkLogin() {
        //TODO
        return false;
    }
    
    public TreeSet<Student> getAllStudents() {
        return this.students;
    }
    
    public TreeSet<Teacher> getAllTeachers() {
        return this.teachers;
    }
    
    public HashSet<Admin> getAllAdmins() {
        return this.admins;
    }
    
    public TreeSet<Manager> getAllManagers() {
        return this.managers;
    }
    
    public TreeSet<Course> getAllCourses() {
        return this.courses;
    }
    
    public TreeMap<Student, Book> getAllBooks() {
        return this.books;
    }
    
    public TreeMap<User, String> getAllLogs() {
        return this.logFiles;
    }
    
    public void saveDatabase() {
    	try {
	        FileOutputStream fos = new FileOutputStream(new File("database.txt"));
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(this);
	        oos.close();
	        System.out.println("The Object  was succesfully written to a file");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public void loadDatabase() throws IOException, ClassNotFoundException {
    	FileInputStream fis = new FileInputStream("database.txt");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	dbObject = (Database)ois.readObject();
    	ois.close();
    }
    public String toString() {
    	return dbObject.toString();
    }
}
