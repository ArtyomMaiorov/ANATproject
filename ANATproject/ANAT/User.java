package ANAT;
import java.io.*;
import java.util.*;
public abstract class User implements Serializable, Comparable<User>, CanBeResearcher {
	private static final long serialVersionUID = 1L;
	private static int idCounter = 0;
	private String ID;    
	private int entranceYear;
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
	private Vector <Message> messages = new Vector<Message>();
	
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
	public String getPassword() {
		return this.password;
	}
	public boolean  getLogStatus() {
		return logStatus;
	}
	public void setLogStatus(boolean logStatus) {
		this.logStatus = logStatus;
	}
	
    //constructor
	public User() throws IOException {
		UserType temp = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter user's first name");
		this.firstName = br.readLine();
		System.out.println("Enter user's last name");
		this.lastName = br.readLine();
		System.out.println("Enter user's email");
		this.email= br.readLine();
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
			temp = UserType.valueOf(br.readLine());
			this.userType = temp;
		} catch(Exception e) {
			System.out.println("Wrong user type");
		}
		System.out.println("Enter user's entrance year");
		this.entranceYear= br.read();
		
		this.ID = generateUserId(temp, this.entranceYear);
	}
    //                          Operations                                  
  	  
    public String generateUserId(UserType userType, int entranceYear) {
    	String id = "";
    	if(userType == UserType.STUDENT) {
    		Student s = (Student)this;
    		id += String.format("%02d", entranceYear) + getDegreeChar(s.getDegree()) + String.format("%06d", idCounter);
    		}
    	else if(userType == UserType.TEACHER)	
    		id += String.format("%02d", entranceYear) + "T" + String.format("%06d", idCounter);
    	else if(userType == UserType.MANAGER)
    		id += String.format("%02d", entranceYear) + "M" + String.format("%06d", idCounter);
    	else if(userType == UserType.ADMIN)
    		id += String.format("%02d", entranceYear) + "A" + String.format("%06d", idCounter);
    	else if(userType == UserType.LIBRARIAN)
    		id += String.format("%02d", entranceYear) + "L" + String.format("%06d", idCounter);
    	
    	idCounter++;
    	return id;
    }
    
    private char getDegreeChar(Degree d) {
        if (d == Degree.BACHELOR) {
            return 'B';
        } else if (d == Degree.MASTER) {
            return 'M';
        } else if (d == Degree.PHD) {
            return 'P';
        } else {
            return '?';
        }
    }
    public void viewNews() {
    	//TODO
//    	System.out.prinlt(News.getNewsTitle());
//    	System.out.prinlt(News.getNewsContent());
    }
    
    public void addLog() {
    	//TODO
    }
    
    public abstract void showInterface() throws IOException;
    
    public void showBasicInterface() throws IOException {
  	  while(Database.currentUser!=null) {
          System.out.println("USER PAGE\n" + "Enter number (Q to quit): ");
          System.out.println("1 - Logout");
          System.out.println("2 - View 2nd menu");
          System.out.println("3 - Change Password");
          System.out.println("4 - View News");
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String s = br.readLine();
          if(s.equalsIgnoreCase("Q")) {
             break;
          }
          else 
          {
        	  if(s.equals("1")) {
        		  Database.logout();
        		  break;
        		  }
        	  if(s.equals("2")) {
        		  break;
        		  }
        	  if(s.equals("3")) {
        		  System.out.println("Enter old Password  to change");
                  String oldPassword = br.readLine();
        		  System.out.println("Enter new Password  to change");
                  String newPassword = br.readLine();
                  Database.changePassword(oldPassword, newPassword);
        		  if(Database.changePassword(oldPassword,newPassword)) 
        			  System.out.println("Succesfully changed");
        		  else System.out.println("Try again!Wrong old password");
        		  	Database.getInstance().saveDatabase();
                  continue;
        	  }
        	  if(s.equals("4")) {this.viewNews();}
          }
  	  }
      Database.getInstance().saveDatabase();
    }
    
    public void sendMessage(User recipient, String subject, String body) {
    	Message message = new Message(this,recipient, subject, body,false);
    	recipient.messages.add(message);
    }
    
    public void readMessages() {
    	for(Message m:messages) {
    		if(m.isRead()==false) {
    			System.out.println(m.getSubject());
    			System.out.println(m.getBody());
    			m.setRead(true);
    		}	
    	}
    }
    
    public void sendMessageToMultipleUsers(List<User> recipients, String subject, String body) {
    	for(User recipient:recipients) {
    		this.sendMessage(recipient, subject, body);
    	}
    }
   
   @Override
	public int hashCode() {
		return Objects.hash(ID, birthDate, citizenship, email, entranceYear, firstName, gender, lastName, login,
				middleName, password, userType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(citizenship, other.citizenship) && Objects.equals(email, other.email)
				&& entranceYear == other.entranceYear && Objects.equals(firstName, other.firstName)
				&& gender == other.gender && Objects.equals(lastName, other.lastName)
				&& Objects.equals(login, other.login) && Objects.equals(middleName, other.middleName)
				&& Objects.equals(password, other.password) && userType == other.userType;
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
