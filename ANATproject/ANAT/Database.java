package ANAT;
import java.util.*;
public class Database {
	
    private TreeSet students;

    private TreeSet teachers;

    private HashSet admins;

    private TreeSet managers;
    
    private TreeSet librarians;

    private HashSet courses;

    private MultiMap books;

    private MultiMap logFiles;
    
    private Vector<News> newsWall;
    private Vector<Message> requests;
    private MultiMap<Employee,Message> messages;
    

    //                          Operations                                  
    
    public void addUser(User newUser) {
    	UserType user == newUser.getUserType();
    	
        if(user == UserType.STUDENT) setStudent(user);		
        else if(user == UserType.TEACHER) setTeacher(user);		
        else if(user == UserType.ADMIN) setAdmin(user);		
        else if(user == UserType.MANAGER) setManager(user);
		else if(user == UserType.LIBRARIAN) setLibrarian(user);
        
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
    public MultiMap getAllBooks() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public MultiMap getAllLogs() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public boolean saveToFile() {
        //TODO
        return false;
    }
    
    
}
