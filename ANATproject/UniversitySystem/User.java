package ANAT;
public abstract class User implements Serializable, Comparable, CanBeResearcher {
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
    //constructor
	public User() {}
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
            return 'Succesfully login';
        }
        return 'Try again!Wrong answer or password';
    }
    
    public void logout(//TODO) {}
    public void showInterface(//TODO) {}
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
	public String toString() {
		return "User [ID=" + ID + ", firstName="
				+ firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", citizenship="+ citizenship + ", email=" + email + ", login=" + login + ", password=" + password + "]";
	}
     
}
