package ANAT;

import java.io.IOException;
import java.util.*;
public class Manager extends Employee implements CanBeResearcher {

    private static final long serialVersionUID = 1L;
	private ManagerType managerType;       
    private Database database = Database.getInstance();
    private Transcript transcript;   
    private Organization organization;  
    
     Vector<UserType> usersToAdd = new Vector<UserType>();
    
    public Manager() throws IOException {
    	super();
    }
    
    //Getters and Setters
    public ManagerType getManagerType() {
        return this.managerType;
    }
   
    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }
     
    public Transcript getTranscript() {
        return this.transcript;
    }
    
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public Organization getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    
   //                                    Operations
    
    //managing news 
    public void addNews(String title,String content) {
    	News article = new News(title,content);
    	database.newsWall.add(article);
    }
    
    public boolean deleteNews(int newsID) {
    	for(News n: database.newsWall) {
    		if(n.getID() == newsID) {
    			database.newsWall.remove(n);
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean updateNews(int newsID,String NewTitle,String NewContent) {
    	for(News n: database.newsWall) {
    		if(n.getID() == newsID) {
    			n.setNewsTitle(NewTitle);
    			n.setNewsContent(NewContent);
    			return true;
    		}
    	}
    	return false;
    }
   
    public void showNews() {
    	for(News n: database.newsWall) {
    		System.out.println(n.getNewsTitle());
    		System.out.println(n.getNewsContent());
    		System.out.println("new's ID:"+ n.getID());
    	}
    }
    
    
    
    
    
    
    public String viewInfo(User user) {
        return user.toString();
    }

//    public String viewRequests() {
//        Vector<Message> requests = database.getRequests();
//        String result = "";
//        for(int i=0;i<requests.size();i++) {
//        	result += requests.get(i).getSender().toString() + " |  " + requests.get(i).getContent() + "\n";
//        }
//        return result;
//    }
    
   
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
        return super.toString() + "Manager's type: " + managerType.toString()+"\n";
    }
    
    public void addUsersToList(UserType user) {
    	usersToAdd.add(user);
    }
    public void sendListOfUsersToAdmin(String adminID) {
    	HashSet hs = database.getAllAdmins();
    	
    	for(Object admin : hs) {
    		if(((Admin)admin).getID().equals(adminID)) {
    			((Admin)admin).setListOfUsersToAdd(usersToAdd);
    			return;
    		}
    	}
    }
    
}
