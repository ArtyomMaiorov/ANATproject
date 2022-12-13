package ANAT;

public class Manager extends Employee implements CanBeResearcher {

    private ManagerType managerType;       
    private Database database;
    private Transcript transcript;   
    private Organization organization;  
    
    Vector<UserType> usersToAdd = new Vector<UserType>();
    
    //Getters and Setters
    private ManagerType getManagerType() {
        return this.managerType;
    }
   
    private ManagerType setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }
    
    public News getNews() {
        return this.news;
    }
    
    public News setNews(News news) {
        this.news = news;
    }
     
    public Transcript getTranscript() {
        return this.transcript;
    }
    
    public Transcript setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
    
    public Database getDatabase() {
        return this.database;
    }
    
    public Database setDatabase(Database database) {
        this.database = database;
    }

    public Organization getOrganization() {
        return this.organization;
    }
    

    public Organization setOrganization(Organization organization) {
        this.organization = organization;
    }
    
    // End of getters and setters

    
    public String managerNews() {
        
        return "";
    }
    private void addNews(String title,String content) {
    	News article = new News(title,content);
    	database.getNewsWall().add(article);
    }
    
    private void deleteNews(int newsID) {
    	Vector<News> wall = database.getNewsWall();
    	for(int i=0;i<wall.size();i++) {
    		if(wall.get(i).getID() == newsID) {
    			wall.remove(i);
    			return;
    		}
    	}
    }

    public String viewInfo(User user) {
        return user.toString();
    }

    public String viewRequests() {
        Vector<Message> requests = database.getRequests();
        String result = "";
        for(int i=0;i<requests.size();i++) {
        	result += requests.get(i).getSender().toString() + " |  " + requests.get(i).getContent + "\n";
        }
        return result;
    }
    
    
    public boolean assignCourses() {
        //TODO
        return false;
    }
    
    
    public String statisticalReport() {
        //TODO
        return "";
    }
    
 
    public boolean approveStudentRegistration() {
        //TODO
        return false;
    }
    

    public String toString() {
        return super().toString() + "Manager's type: " + managerType.toString()+"\n";
    }
    
    public void addUsersToList(UserType user) {
    	usersToAdd.add(user);
    }
    public void sendListOfUsersToAdmin(String adminID) {
    	HashSet hs = database.getAllAdmins();
    	
    	for(Admin admin:hs) {
    		if(admin.getID().equals(adminID)) {
    			admin.setListOfUsersToAdd(usersToAdd);
    			return;
    		}
    	}
    }
    
}
