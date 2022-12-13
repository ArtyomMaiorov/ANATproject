package ANAT;
import java.io.*;
import java.util.*;
public abstract class User implements Serializable, Comparable<User>, CanBeResearcher {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ID;    
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;
    private Gender gender; 
    private String citizenship;
    private String email;
    private String login;
    private String password;
    private UserType userType;
    private boolean logStatus = false;
	private String address;
    
    //getter/setter
    public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public boolean  getLogStatus() {
		return logStatus;
	}
	public void setLogStatus(boolean logStatus) {
		this.logStatus = logStatus;
	}
    //constructor
	public User() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter user's ID");
		this.ID = br.readLine();
		System.out.println("Enter user's email");
		this.email= br.readLine();
		System.out.println("Enter user's first name");
		this.firstName = br.readLine();
		System.out.println("Enter user's last name");
		this.lastName = br.readLine();
		System.out.println("Enter user's middle name");
		this.middleName = br.readLine();
		System.out.println("Enter user's birth date");
		this.birthDate = br.readLine();
		System.out.println("Enter user's gender");
		try {
			this.gender = Gender.valueOf(br.readLine());	
		} catch (Exception e) {
			System.out.println("Wrong gender");
		}
		System.out.println("Enter user's citizenship");
		this.citizenship = br.readLine();
		System.out.println("Enter user's login");
		this.login = br.readLine();
		System.out.println("Enter user's password");
		this.password = br.readLine();
		System.out.println("Enter user's user type");
		try {
			this.userType = UserType.valueOf(br.readLine());
		} catch(Exception e) {
			System.out.println("Wrong user type");
		}
//		this.ID = ID;
//		this.email = email;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.middleName = middleName;
//		this.birthDate = birthDate;
//		this.gender = gender;
//		this.citizenship = citizenship;
//		this.login = login;
//		this.password = password;
//		this.userType = userType;
	}
    //                          Operations                                  
    
    public String login() {
        if(login.equals(this.login) && password.equals(this.password)) {
        	logStatus = true;
            return "Succesfully login";
            
        }
        return "Try again!Wrong login or password";
    }
    
    public void logout() {
    	if(logStatus) {
    		logStatus = false;
    		System.out.println("Succesfully logout");
    	}
    	else System.out.println("You need to login,then you can logout!");	
    }
  	  
    public boolean changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)) {
            password = newPassword;
            return true;
        }return false;
    }
    public void viewNews() {
    	//TODO
//    	System.out.prinlt(News.getNewsTitle());
//    	System.out.prinlt(News.getNewsContent());
    }
    
    public void addLog() {
    	//TODO
    }
    public abstract void showInterface();
    
    public void showBasicInterface() {
  	  while(true) {
          System.out.println("(User)\n" + "Enter number(S to stop choosing): ");
          System.out.println("1.Login");
          System.out.println("2.Logout");
          System.out.println("3.Change Password");
          System.out.println("4.View News");
          Scanner input = new Scanner(System.in);
          String s = input.next();
          if(s.equals("S")) {
             break;
          }
          else 
          {
        	  if(s.equals("1")) {
        		  this.login();
        		  }
        	  if(s.equals("2")) {
        		  this.logout();
        		  }
        	  if(s.equals("3")) {
        		  System.out.println("Enter old Password  to change");
                  String oldPassword = input.next();
        		  System.out.println("Enter new Password  to change");
                  String newPassword = input.next();
        		  if(this.changePassword(oldPassword,newPassword)) 
        			  System.out.println("Succesfully changed");
        		  else System.out.println("Try again!Wrong old password");
        	  }
        	  if(s.equals("4")) {this.viewNews();}
          }
  	  }
    }
    
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return ID.equals(other.ID) && gender.equals(other.gender)&& userType.equals(other.userType)&& address.equals(other.address) && birthDate.equals(other.birthDate) && citizenship.equals(other.citizenship) && email.equals(other.email) && firstName.equals(other.firstName) && lastName.equals(other.lastName)  && login.equals(other.login)  && middleName.equals(other.middleName)&&  password.equals(other.password);
	}
	
   public int hashCode() {
        return Objects.hash(ID, firstName, lastName ,middleName ,birthDate, gender,citizenship, email,login, password, userType);
    }
   
   public int compareTo(User user) {
       return ID.compareTo(user.ID);
   }
   
	public String toString() {
		return "User [ID=" + ID + ", firstName="
				+ firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", citizenship="+ citizenship + ", email=" + email + ", login=" + login + ", password=" + password + "]";
	}
}
