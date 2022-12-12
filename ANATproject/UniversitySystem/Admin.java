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
            System.out.println("Enter number(S to stop choosing): ");
            System.out.println("1.add User");
            System.out.println("2.update User");
            System.out.println("3.delete User");
            System.out.println("4.View LogFiles);
            Scanner input = new Scanner(System.in);
            String s = input.next();
            if(s.equals("S")) {
               System.exit(0);
            }
            else 
            {
          	  if(n==1) {
          		   System.out.println('ID:');
          		   Scanner input = new Scanner(System.in);
                   String ID = input.next();
                   System.out.println('firstName:');
                   Scanner input = new Scanner(System.in);
                   String firstName = input.next();
                   System.out.println('lastName:');
                   Scanner input = new Scanner(System.in);
                   String lastName = input.next();
                   System.out.println('middleName:');
                   Scanner input = new Scanner(System.in);
                   String middleName = input.next();
                   System.out.println('birthDate:');
                   Scanner input = new Scanner(System.in);
                   String birthDate = input.next();
                   System.out.println('gender:');
                   Scanner input = new Scanner(System.in);
                   Gender gender = input.next();
                   System.out.println('citizenship:');
                   Scanner input = new Scanner(System.in);
                   String citizenship = input.next();
                   System.out.println('email:');
                   Scanner input = new Scanner(System.in);
                   String email = input.next();
                   System.out.println('login:');
                   Scanner input = new Scanner(System.in);
                   String login = input.next();
                   System.out.println('password:');
                   Scanner input = new Scanner(System.in);
                   String password = input.next();
                   System.out.println('userType:');
                   Scanner input = new Scanner(System.in);
                   UserType userType = input.next();
          		  User user = new User(ID,firstName,lastName,middleName,birthDate,gender,citizenship,email, login, password, userType);
          		  this.addUser(user);}
          	  if(n==2) {this.updateUser(user);}
          	  if(n==3) {this.deleteUser(user);}
          	  if(n==4) {this.seeLogFiles();}
            }
    	  }
    
    
}
