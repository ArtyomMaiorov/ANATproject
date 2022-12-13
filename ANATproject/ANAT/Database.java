package ANAT;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
public class Database implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Database dbObject;
	private static TreeSet<Student> students;
	private TreeSet teachers;
    private HashSet admins;
    private TreeSet managers;  
    private TreeSet librarians;
    private HashSet courses;
    private HashMap<Book, Student> books;
//    private MultiMap logFiles; 
    private Vector<News> newsWall;
    private Vector<Message> requests;
//    private HashTable<int id, LinkedList<Message>> messages;
    
    
    {
    	students = new TreeSet<Student>();
//    	messages = new HashTable<int, LinkedList<Message>>();
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
    
//    public void addMessage(int employeeID,Message message) {
//    	messages.get(employeeID).offer(message);
//    }
//    
//    public LinkedList<Message> getMessages(int employeeID) {
//    	return messages.get(employeeID);
//    }
    
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
    
    /**
    * @generated
    */
    public TreeSet getAllUsers() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public TreeSet getAllStudents() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public TreeSet getAllTeachers() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public HashSet getAllAdmins() {
        return admins;
    }
    
    /**
    * @generated
    */
    public TreeSet getAllManagers() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public HashSet getAllCourses() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
//    public MultiMap getAllBooks() {
//        //TODO
//        return null;
//    }
//    
//    public MultiMap getAllLogs() {
//        //TODO
//        return null;
//    }
    
    public void addStudent(Student s) {
    	students.add(s);
    }
    public void readFromFile(String filePath) {
//    	FileInputStream fis = new FileInputStream(s);
//    	InputStreamReader reader = new InputStreamReader(fis, Charset.forName("UTF_16"));
    	try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    public void saveToFile() {
    	System.out.println(this.toString());
    	try {
	        FileOutputStream fileOut = new FileOutputStream("students.txt", true);
	        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	        
	        objectOut.writeUTF(this.toString());
	        objectOut.close();
	        System.out.println("The Object  was succesfully written to a file");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public void addBook(Book book, Student student) {
    	books.put(book, student);
    }
    public String toString() {
    	return Database.students.toString();
    }
}
