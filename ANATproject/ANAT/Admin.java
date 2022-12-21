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
    	  while(true) {
            System.out.println("ADMIN PAGE\n" + "Enter number (Q to quit): ");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. View LogFiles");
            System.out.println("5. Main menu");
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            if(s.equals("Q")) {
               System.exit(0);
            }
            else 
            {
          	  if(s.equals("1")) {
          		   
          	  }
          	  if(s.equals("2")) {continue;}
          	  if(s.equals("3")) {continue;}
          	  if(s.equals("4")) this.seeLogFiles();
          	  if(s.equals("5")) this.showBasicInterface();
            }
    	  }
    
    
}
}
