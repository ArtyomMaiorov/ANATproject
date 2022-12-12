package ANAT;
import java.util.*;
public class Database {
	
    private TreeSet users;

    private TreeSet students;

    private TreeSet teachers;

    private HashSet admins;

    private TreeSet managers;

    private HashSet courses;

    private MultiMap books;

    private MultiMap logFiles;
    
    private Vector<News> newsWall;
    private Vector<Message> requests;
    private MultiMap<Employee,Message> messages;

    
    public Vector getRequests() {
    	return this.requests;
    }
    
    
    private TreeSet getUsers() {
        return this.users;
    }
    
    /**
    * @generated
    */
    private TreeSet setUsers(TreeSet users) {
        this.users = users;
    }
    
    
    /**
    * @generated
    */
    private TreeSet getStudents() {
        return this.students;
    }
    
    /**
    * @generated
    */
    private TreeSet setStudents(TreeSet students) {
        this.students = students;
    }
    
    
    /**
    * @generated
    */
    private TreeSet getTeachers() {
        return this.teachers;
    }
    
    /**
    * @generated
    */
    private TreeSet setTeachers(TreeSet teachers) {
        this.teachers = teachers;
    }
    
    
    /**
    * @generated
    */
    private HashSet getAdmins() {
        return this.admins;
    }
    
    /**
    * @generated
    */
    private HashSet setAdmins(HashSet admins) {
        this.admins = admins;
    }
    
    
    /**
    * @generated
    */
    private TreeSet getManagers() {
        return this.managers;
    }
    
    /**
    * @generated
    */
    private TreeSet setManagers(TreeSet managers) {
        this.managers = managers;
    }
    
    
    /**
    * @generated
    */
    private HashSet getCourses() {
        return this.courses;
    }
    
    /**
    * @generated
    */
    private HashSet setCourses(HashSet courses) {
        this.courses = courses;
    }
    
    
    /**
    * @generated
    */
    private MultiMap getBooks() {
        return this.books;
    }
    
    /**
    * @generated
    */
    private MultiMap setBooks(MultiMap books) {
        this.books = books;
    }
    
    
    /**
    * @generated
    */
    private  getAttribute() {
        return this.attribute;
    }
    
    /**
    * @generated
    */
    private  setAttribute(invalid attribute) {
        this.attribute = attribute;
    }
    
    
    /**
    * @generated
    */
    private MultiMap getLogFiles() {
        return this.logFiles;
    }
    
    /**
    * @generated
    */
    private MultiMap setLogFiles(MultiMap logFiles) {
        this.logFiles = logFiles;
    }
    
    
    
    /**
    * @generated
    */
    public Librarian getLibrarian() {
        return this.librarian;
    }
    
    /**
    * @generated
    */
    public Librarian setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    
    /**
    * @generated
    */
    public Mark getMark() {
        return this.mark;
    }
    
    /**
    * @generated
    */
    public Mark setMark(Mark mark) {
        this.mark = mark;
    }
    
    
    /**
    * @generated
    */
    public Mark getMark() {
        return this.mark;
    }
    
    /**
    * @generated
    */
    public Mark setMark(Mark mark) {
        this.mark = mark;
    }
    
    
    /**
    * @generated
    */
    public Manager getManager() {
        return this.manager;
    }
    
    /**
    * @generated
    */
    public Manager setManager(Manager manager) {
        this.manager = manager;
    }
    
    
    /**
    * @generated
    */
    public Admin getAdmin() {
        return this.admin;
    }
    
    /**
    * @generated
    */
    public Admin setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public Student setStudent(Student student) {
        this.student = student;
    }
    
    public Vector getNewsWall() {
    	return this.newsWall;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
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
        //TODO
        return null;
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
