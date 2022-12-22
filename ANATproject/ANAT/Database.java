package ANAT;

import java.util.*;
import java.io.*;
public class Database implements Serializable{
	public static User currentUser;
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
    public Vector<Organization> listOfOrganizations;
     Vector<News> newsWall =  new Vector<News>();//we can add/delete/update news and show them
    private static Vector<Message> requests; //managers will be able to get all requests
//    private static HashTable<String, LinkedList<Message>> messages; // by id of employee, we can get all messages which he/she/it retrieved
     
    {
    	students = new TreeSet<Student>();
    	teachers = new TreeSet<Teacher>();
    	admins = new HashSet<Admin>();
    	managers = new TreeSet<Manager>();
    	librarians = new TreeSet<Librarian>();
    	courses = new TreeSet<Course>();
    	books = new TreeMap<Student, Book>();
    	logFiles = new TreeMap<User, String>();
    	listOfOrganizations = new Vector<Organization>();
//    	messages = new HashTable<String, LinkedList<Message>>();
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
    
    public void addUser(User newUser) {
    	UserType user = newUser.getUserType();
        if(user == UserType.STUDENT) setStudent((Student) newUser);		
        else if(user == UserType.TEACHER) setTeacher((Teacher) newUser);		
        else if(user == UserType.ADMIN) setAdmin((Admin) newUser);		
        else if(user == UserType.MANAGER) setManager((Manager) newUser);
		else if(user == UserType.LIBRARIAN) setLibrarian((Librarian) newUser);
    }
    public boolean deleteUser(User user) {
    	if(user.getUserType() == UserType.STUDENT) students.remove((Student)user);		
        else if(user.getUserType() == UserType.TEACHER) teachers.remove((Teacher)user)	;	
        else if(user.getUserType() == UserType.ADMIN) admins.remove((Admin)user);		
        else if(user.getUserType() == UserType.MANAGER) managers.remove((Manager)user);
		else if(user.getUserType() == UserType.LIBRARIAN) librarians.remove((Librarian)user);
		else return false;
    	return true;
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
    public void setCourses(Course course) {
    	courses.add(course);
    }
    
    public TreeSet<Student> getAllStudents() {
        return this.students;
    }
    
    public TreeSet<Teacher> getAllTeachers() {
        return this.teachers;
    }
    
    public TreeSet<Librarian> getAllLibrarians(){
    	return this.librarians;
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
    
//    public Vector<News> getNewsWall() {
//		return newsWall;
//	}
//	public void setNewsWall(Vector<News> newsWall) {
//		Database.newsWall = newsWall;
//	}
	public Vector<Message> getRequests() {
		return requests;
	}
	public void setRequests(Vector<Message> requests) {
		this.requests = requests;
	}
    
	public void addOrganization(Organization o) {
		this.listOfOrganizations.add(o);
	}
	
    public void saveDatabase() throws IOException {
    	File file = new File("database.txt");
    	file.createNewFile();
    	if (!file.exists()) {
    	    file.createNewFile();
    	}
    	// Check if the file is writable
    	if (!file.canWrite()) {
    	    // Modify the file's permissions to make it writable
    	    file.setWritable(true);
    	}

    	try {
	        FileOutputStream fos = new FileOutputStream("database.txt");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(dbObject);
	        oos.writeObject("hello");
	        oos.close();
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
    
    public void login(String login, String password) throws ClassNotFoundException, IOException, UnsuccessfulLoginException {
    	loadDatabase();
    	boolean isLogedIn = false;
    	
    	for(Student student : students) {
			if(student.getLogin().equals(login) && student.getPassword().equals(password)) {
				currentUser = student;
				isLogedIn = true;
				return;
			} 
		}
    		
    	for(Teacher teacher : teachers) {
			if(teacher.getLogin().equals(login) && teacher.getPassword().equals(password)) {
				currentUser = teacher;
				isLogedIn = true;
				return;
			} 
		}
    	for(Manager manager: managers) {
			if(manager.getLogin().equals(login) && manager.getPassword().equals(password)) {
				currentUser = manager;
				isLogedIn = true;
				return;
			} 
		}
    	for(Admin admin: admins) {
			if(admin.getLogin().equals(login) && admin.getPassword().equals(password)) {
				currentUser = admin;
				isLogedIn = true;
				return;
			} 
		}
    	for(Librarian librarian: librarians) {
			if(librarian.getLogin().equals(login) && librarian.getPassword().equals(password)) {
				currentUser = librarian;
				isLogedIn = true;
				return;
			} 
		}
    	
    	if(!isLogedIn) {
	        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );

    	} else {
        	System.out.println("Log in is successful");

    	}
    }

    public static void logout() {
    	currentUser = null;
    }
    public static boolean changePassword(String oldPassword, String newPassword) throws IOException {
        if(oldPassword.equals(currentUser.getPassword())) {
        	currentUser.setPassword(newPassword);
        	dbObject.saveDatabase();
            return true;
            
        }   
        return false;
        

    }
	@Override
	public String toString() {
		return "Database [students=" + students + "\n, teachers=" + teachers + "\n, admins=" + admins + "\n, managers="
				+ managers + "\n, librarians=" + librarians + "\n, courses=" + courses + "\n, books=" + books + "\n, logFiles="
				+ logFiles + "\n, newsWall=" + newsWall + "]";
	}
	
    
	
}
