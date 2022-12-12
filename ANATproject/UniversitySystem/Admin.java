package ANAT;

import java.util.Scanner;

public class Admin extends User {
	
    private UserFactory userFactory;
    private Manager manager;
    private Database database;
    
   //Getter/setter
    public Manager getManager() {
        return this.manager;
    }
    public Manager setManager(Manager manager) {
        this.manager = manager;
    }
    public UserFactory getUserFactory() {
        return this.userFactory;
    }
    public UserFactory setUserFactory(UserFactory userFactory) {
        this.userFactory = userFactory;
    }
    public Database getDatabase() {
        return this.database;
    }
    public Database setDatabase(Database database) {
        this.database = database;
    }
    
    public Admin(String ID,String firstName,String lastName,String middleName,
			 String birthDate,Gender gender,String citizenship,String email, 
			 String login, String password, UserType userType) {
    	super(ID,firstName,lastName,middleName,birthDate,gender,citizenship,email, login, password, userType);
    }
    
    //                          Operations                                  
    public void addUser(User user) {
        
    }
    
    public void updateUser(User user) {
        //TODO
    }
    
    public void deleteUser(User user) {
        //TODO
    }
    
    public void seeLogFiles() {
        //TODO
    }
    
    public void showInterface() {
    	  while(true) {
            System.out.print("Enter number(S to stop choosing): ");
            System.out.print("1.add User");
            System.out.print("2.update User");
            System.out.print("3.delete User");
            System.out.print("4.View LogFiles);
            Scanner input = new Scanner(System.in);
            String s = input.next();
            if(s.equals("S")) {
               System.exit(0);
            }
            else 
            {
          	  if(n==1) {
          		   System.out.print('ID:');
          		   Scanner input = new Scanner(System.in);
                   String ID = input.next();
                   Scanner input = new Scanner(System.in);
                   String firstName = input.next();
                   Scanner input = new Scanner(System.in);
                   String lastName = input.next();
                   Scanner input = new Scanner(System.in);
                   String middleName = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
                   Scanner input = new Scanner(System.in);
                   String s = input.next();
          		  User user = new User(ID,firstName,lastName,middleName,birthDate,gender,citizenship,email, login, password, userType);
          		  this.addUser(user);}
          	  if(n==2) {this.updateUser(user);}
          	  if(n==3) {this.deleteUser(user);}
          	  if(n==4) {this.seeLogFiles();}
            }
    	  }
    
    
}
