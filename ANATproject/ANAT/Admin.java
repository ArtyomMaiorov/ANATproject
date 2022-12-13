package ANAT;

import java.io.IOException;
import java.util.*;

public class Admin extends User {
    /**
	 * 
	 */
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
    
    public void showInterface() {
    	  while(true) {
            System.out.println("Enter number(S to stop choosing): ");
            System.out.println("1.add User");
            System.out.println("2.update User");
            System.out.println("3.delete User");
            System.out.println("4.View LogFiles");
            Scanner input = new Scanner(System.in);
            String s = input.next();
            if(s.equals("S")) {
               System.exit(0);
            }
            else 
            {
          	  if(s.equals("1")) {
          		   
          	  }
          	  if(s.equals("2")) {continue;}
          	  if(s.equals("3")) {continue;}
          	  if(s.equals("4")) {this.seeLogFiles();}
            }
    	  }
    
    
}
}
