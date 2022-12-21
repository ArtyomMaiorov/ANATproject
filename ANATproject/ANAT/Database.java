package ANAT;

import java.util.*;
import java.io.*;
public class Database implements Serializable{
	public static User currentUser;
	private static final long serialVersionUID = 1L;
	private static Database dbObject;
	private static TreeSet<Student> students;
	private static TreeSet<Teacher> teachers;
    private static HashSet<Admin> admins;
    private static TreeSet<Manager> managers;  
    private static TreeSet<Librarian> librarians;
    private static TreeSet<Course> courses;
    private static TreeMap<Student, Book> books;
    private static TreeMap<User,String> logFiles; 
    
     Vector<News> newsWall =  new Vector<News>();//we can add/delete/update news and show them
    private static Vector<Message> requests; //managers will be able to get all requests
//    private static HashTable<String, LinkedList<Message>> messages; // by id of employee, we can get all messages which he/she/it retrieved
     
    {
    	students = new TreeSet<Student>();
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
    
    public static void saveDatabase() throws IOException {
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
	        System.out.println("The Object  was succesfully written to a file");
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void loadDatabase() throws IOException, ClassNotFoundException {
    	FileInputStream fis = new FileInputStream("database.txt");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	dbObject = (Database)ois.readObject();
    	ois.close();
    }
    
    public static void login(String login, String password, int which) throws ClassNotFoundException, IOException, UnsuccessfulLoginException {
    	loadDatabase();
    	boolean isLogedIn = false;
    	UserType whichUser = UserType.values()[which];
    	switch(whichUser) {
    	case STUDENT:
    		for(Student student : students) {
    			if(student.getLogin().equals(login) && student.getPassword().equals(password)) {
    				currentUser = student;
    				isLogedIn = true;
    			} else {
    		        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );
    			}
    		}
    		break;
    	case TEACHER:
    		for(Teacher teacher : teachers) {
    			if(teacher.getLogin().equals(login) && teacher.getPassword().equals(password)) {
    				currentUser = teacher;
    				isLogedIn = true;
    			} else {
    		        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );
    			}
    		}
    		break;
    	case MANAGER:
    		for(Manager manager: managers) {
    			if(manager.getLogin().equals(login) && manager.getPassword().equals(password)) {
    				currentUser = manager;
    				isLogedIn = true;
    			} else {
    		        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );
    			}
    		}
    		break;
    	case ADMIN:
    		for(Admin admin: admins) {
    			if(admin.getLogin().equals(login) && admin.getPassword().equals(password)) {
    				currentUser = admin;
    				isLogedIn = true;
    			} else {
    		        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );
    			}
    		}
    		break;
    	case LIBRARIAN:
    		for(Librarian librarian: librarians) {
    			if(librarian.getLogin().equals(login) && librarian.getPassword().equals(password)) {
    				currentUser = librarian;
    				isLogedIn = true;
    			} else {
    		        throw new UnsuccessfulLoginException ("Incorrect login or password : " + login + " " + password );
    			}
    		}
    		break;
    	default:
    		currentUser = null;
    	}
    	String success = (isLogedIn) ? "successful" : "not successful";
    	System.out.println("Log in is " + success);
    }

    public static void logout() {
    	currentUser = null;
    }
	public String toString() {
		return "Database [students=" + students + ", teachers=" + teachers + ", admins=" + admins + ", managers="
				+ managers + ", librarians=" + librarians + ", courses=" + courses + ", books=" + books + ", logFiles="
				+ logFiles + ", newsWall=" + newsWall + ", requests=" + requests + ", messages=" + messages + "]";
	}
    
	
}
