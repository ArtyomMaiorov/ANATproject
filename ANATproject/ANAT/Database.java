package ANAT;
import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Database implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Database dbObject;
	
	private static TreeSet<Student> students = new TreeSet<Student>();

    private TreeSet<Teacher> teachers;

    private HashSet<Admin> admins;

    private TreeSet<Manager> managers;
    
    private TreeSet<Librarian> librarians;

    private HashSet<Course> courses;

//    private MultiMap books;
//
//    private MultiMap logFiles;
    
    private Vector<News> newsWall;
    private Vector<Message> requests;
//    private MultiMap<Employee,Message> messages;
    
    public Database() {
    	
    }
    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
           dbObject = new Database();
        }

         // returns the singleton object
         return dbObject;
     }
    //                          Operations                                  
    
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
  
    public TreeSet<User> getAllUsers() {
        //TODO
        return null;
    }
  
    public TreeSet<Student> getAllStudents() {
        //TODO
        return students;
    }
    
    
    public TreeSet<Teacher> getAllTeachers() {
        //TODO
        return teachers;
    }
    
    /**
    * @generated
    */
    public HashSet<Admin> getAllAdmins() {
        return admins;
    }
    
    /**
    * @generated
    */
    public TreeSet<Manager> getAllManagers() {
        //TODO
        return managers;
    }
    
    /**
    * @generated
    */
    public HashSet<Course> getAllCourses() {
        //TODO
        return courses;
    }
    
    /**
    * @generated
    */
//    public MultiMap getAllBooks() {
//        //TODO
//        return null;
//    }
    
    /**
    * @generated
    */
//    public MultiMap getAllLogs() {
//        //TODO
//        return null;
//    }
    
    public void addStudent(Student s) {
    	students.add(s);
    }
    /**
    * @generated
    */
    public void saveToFile() {
    	try {
	        FileOutputStream fileOut = new FileOutputStream(new File("students.txt"));
	        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	        objectOut.writeObject(this);
	        objectOut.close();
	        System.out.println("The Object  was succesfully written to a file");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public String toString() {
    	return Database.students.toString();
    }
    
    
}
