package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Admin extends User {
    
	private static final long serialVersionUID = 1L;
	private UserFactory userFactory;
    private Manager manager;
    private Database database;
    
    private Vector<UserType> usersToAdd = new Vector<UserType>();
    
    
   //Getter/setter
    public Manager getManager() {
        return this.manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public UserFactory getUserFactory() {
        return this.userFactory;
    }
    public void setUserFactory(UserFactory userFactory) {
        this.userFactory = userFactory;
    }
    public Database getDatabase() {
        return this.database;
    }
    public void setDatabase(Database database) {
        this.database = database;
    }
    //constructor
    public Admin() throws IOException {
    	super();
    }
    
    //                          Operations 
    
    public void setListOfUsersToAdd(Vector<UserType> list) {
    	this.usersToAdd.addAll(list);
    }
    
    public void addUsers() throws IOException {
        userFactory.createUsers(usersToAdd);
        usersToAdd.clear();
    }
    
    public void updateUsers(User user) {
        //TODO
    }
    
    public void deleteUsers(User user) {
        //TODO
    }
    
    public void seeLogFiles() {
        //TODO
    }
    
    public void showInterface() throws IOException {
    	super.showBasicInterface();
    	  while(Database.currentUser!=null) {
            System.out.println("ADMIN PAGE\n" + "Enter number (Q to quit): ");
            System.out.println("1 - Go to User Menu");
            System.out.println("2 - Add User");
            System.out.println("3 - Delete User");
            System.out.println("4 - View LogFiles");
            System.out.println("5 - Update User");
            System.out.println("6 - View Database");
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            if(s.equalsIgnoreCase("Q")) {
               System.exit(0);
            }
            else 
            {
          	  if(s.equals("2")) {
                  System.out.println("1 - Add Student");
                  System.out.println("2 - Add Teacher");
                  System.out.println("3 - Add Manager");
                  System.out.println("4 - Add Librarian");
                  System.out.println("5 - Add Admin");
                  String userChoice = br.readLine();
                  switch(userChoice) {
                  	case "1":
                  		System.out.println("Creating student");
                  		Student student = new Student();
                  		Database.getInstance().setStudent(student);
                  		break;
                  	case "2":
                  		Teacher teacher = new Teacher();
                  		Database.getInstance().setTeacher(teacher);
                  		break;
                  	case "3":
                  		Manager manager = new Manager();
                  		Database.getInstance().setManager(manager);
                  		break;
                  	case "4":
                  		Librarian librarian = new Librarian();
                  		Database.getInstance().setLibrarian(librarian);
                  		break;
                  	case "5":
                  		Admin admin = new Admin();
                  		Database.getInstance().setAdmin(admin);
                  }
                  Database.getInstance().saveDatabase();

          	  }
          	  if(s.equals("5")) {continue;}
          	  if(s.equals("3")) {
          		System.out.println("1 - Delete Student");
                System.out.println("2 - Delete Teacher");
                System.out.println("3 - Delete Manager");
                System.out.println("4 - Delete Librarian");
                System.out.println("5 - Delete Admin");
                String userChoice = br.readLine();
                switch(userChoice) {
                	case "1":
                		Student studentToBeRemoved = null;
                		System.out.println("Here is a list of all Students: " + Database.getInstance().getAllStudents() + "\nWhich one do you want to remove?");
                		String enteredID = br.readLine();
                    	for(Student student : Database.getInstance().getAllStudents()) {
                    		if(student.getID().equals(enteredID)) {
                    			studentToBeRemoved = student;
                    		}
                    	}
                    	Database.getInstance().getAllStudents().remove(studentToBeRemoved);
                    	System.out.println("Student removed successfully");
                		break;
                	case "2":
                		Teacher teacherToBeRemoved = null;
                		System.out.println("Here is a list of all Teachers: " + Database.getInstance().getAllTeachers() + "\nWhich one do you want to remove?");
                		enteredID = br.readLine();
                    	for(Teacher teacher: Database.getInstance().getAllTeachers()) {
                    		if(teacher.getID().equals(enteredID)) {
                    			teacherToBeRemoved = teacher;
                    		}
                    	}
                    	Database.getInstance().getAllTeachers().remove(teacherToBeRemoved);
                    	System.out.println("Teacher removed successfully");
                		break;
                	case "3":
                		Manager managerToBeRemoved = null;
                		System.out.println("Here is a list of all Managers: " + Database.getInstance().getAllManagers() + "\nWhich one do you want to remove?");
                		enteredID = br.readLine();
                    	for(Manager manager: Database.getInstance().getAllManagers()) {
                    		if(manager.getID().equals(enteredID)) {
                    			managerToBeRemoved = manager;
                    		}
                    	}
                    	Database.getInstance().getAllManagers().remove(managerToBeRemoved);
                    	System.out.println("Manager removed successfully");
                		break;
                	case "4":
                		Librarian librarianToBeRemoved = null;
                		System.out.println("Here is a list of all Librarians: " + Database.getInstance().getAllLibrarians() + "\nWhich one do you want to remove?");
                		enteredID = br.readLine();
                    	for(Librarian librarian: Database.getInstance().getAllLibrarians()) {
                    		if(librarian.getID().equals(enteredID)) {
                    			librarianToBeRemoved = librarian;
                    		}
                    	}
                    	Database.getInstance().getAllLibrarians().remove(librarianToBeRemoved);
                    	System.out.println("Librarian removed successfully");
                		break;
                	case "5":
                		Admin adminToBeRemoved = null;
                		System.out.println("Here is a list of all Admins: " + Database.getInstance().getAllAdmins() + "\nWhich one do you want to remove?");
                		enteredID = br.readLine();
                    	for(Admin admin: Database.getInstance().getAllAdmins()) {
                    		if(admin.getID().equals(enteredID)) {
                    			adminToBeRemoved = admin;
                    		}
                    	}
                    	Database.getInstance().getAllAdmins().remove(adminToBeRemoved);
                    	System.out.println("Admin removed successfully");
                }
                Database.getInstance().saveDatabase();

          	  }
          	  if(s.equals("4")) this.seeLogFiles();
          	  if(s.equals("1")) this.showBasicInterface();
          	  if(s.equals("6")) System.out.println(Database.getInstance().toString());;

            }
    	  }
    }
}
