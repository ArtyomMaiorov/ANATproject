package ANAT;

import java.util.Scanner;
public class User implements Serializable, Comparable, CanBeResearcher {
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
	public String getPassword() {
		return password;
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
	public User(String ID,String firstName,String lastName,String middleName,
			 String birthDate,Gender gender,String citizenship,String email, 
			 String login, String password, UserType userType) {
		this.ID = ID;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.citizenship = citizenship;
		this.login = login;
		this.password = password;
		this.userType = userType;
	}
    //                          Operations                                  
    
    public String login() {
        if(login.equals(this.login) && password.equals(this.password)) {
        	logStatus = true;
            return 'Succesfully login';
        }
        return 'Try again!Wrong login or password';
    }
    
    public void logout() {
    	if(logStatus) {
    		logStatus = false;
    		System.out.prinlt('Succesfully logout');
    	}
    	else System.out.prinlt('You need to login,then you can logout!');	
    }
  	  
    public boolean changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password)) {
            password = newPassword;
            return true;
        }return false;
    }
    public void viewNews() {
    	System.out.prinlt(News.getNewsTitle());
    	System.out.prinlt(News.getNewsContent());
    }
    
    public void addLog(//TODO) {} 
    
    public void showInterface() {
  	  while(true) {
          System.out.print("Enter number(S to stop choosing): ");
          System.out.print("1.Login");
          System.out.print("2.Logout");
          System.out.print("3.Change Password");
          System.out.print("4.View News");
          Scanner input = new Scanner(System.in);
          String s = input.next();
          if(s.equals("S")) {
             System.exit(0);
          }
          else 
          {
        	  if(n==1) {this.login()}
        	  if(n==2) {this.logout();}
        	  if(n==3) {
        		  System.out.print('Enter old Password  to change');
        		  Scanner input = new Scanner(System.in);
                  String oldPassword = input.next();
        		  System.out.print('Enter new Password  to change');
        		  Scanner input = new Scanner(System.in);
                  String newPassword = input.next();
        		  if(this.changePassword(oldPassword,newPassword)) 
        			  System.out.print('Succesfully changed');
        		  else System.out.print('Try again!Wrong old password');
        	  }
        	  if(n==4) {this.viewNews();}
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
		return ID.equals(other.ID) && gender.equals(other.gender)&& userType.equals(other.userType)&& address.equals(other.address) && birthDate.equals(other.birthDate) && citizenship.equals(other.citizenship) && email.equals(other.email) && firstName.equals(other.firstName) && lastName.equals(other.lastName)  && login.equals(other.login) && maritalStatus.equals(other.maritalStatus) && middleName.equals(other.middleName)&& nationality.equals(other.nationality) &&  password.equals(other.password);
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
