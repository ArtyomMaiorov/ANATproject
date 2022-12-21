package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Manager extends Employee implements CanBeResearcher {

    private static final long serialVersionUID = 1L;
    private Database database = Database.getInstance();
    private Transcript transcript;   
    private Organization organization;  
    
    Vector<UserType> usersToAdd = new Vector<UserType>();
    
    public Manager() throws IOException {
    	super();
    }
    
    //Getters and Setters
    
     
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
    
    public static boolean approveRegistration(Student student, Course course) {
    	System.out.println(course.isFull());
    	if(!course.isFull()) {
    		if(course.getFaculty().equals(student.getFaculty())) {
    			if(student.getCreditLimit() >= student.getTotalCredits()) {
    				return true;
    			}
    			else System.out.println("Too many credits");
    		}
    		else System.out.println("Faculty doesn't match, register for an elective");
    	}
    	else System.out.println("Course is full");
    	return false;
    }
    
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
    
    
    
    
    public void approveOrganization(Organization o) {
    	database.addOrganization(o);
    }
    
    public String viewInfo(User user) {
        return user.toString();
    }

    public String viewRequests() {
        Vector<Message> requests = database.getRequests();
        String result = "";
        for(int i=0;i<requests.size();i++) {
        	result += requests.get(i).toString();
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
    
 
    

    public String toString() {
        return super.toString();
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
    
    public void showInterface() throws IOException {
   	 super.showBasicInterface();
   	 while(true) {
           System.out.println("MANAGER PAGE\n Enter number (Q to stop choosing): ");
           System.out.println("1 - Go to User Menu");
           System.out.println("2 - Create Course");
           System.out.println("3 - Delete Course");
           System.out.println("4 - ");
           
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String s = br.readLine();
           if(s.equalsIgnoreCase("Q")) {
              System.exit(0);
           }
           else 
           {
        	   if(s.equals("1")) this.showBasicInterface();
        	   
               if(s.equals("2")) {
               		Course course = new Course();
               		Database.getInstance().setCourses(course);
                    Database.getInstance().saveDatabase();

               }
               else if(s.equals("3")) {
            	Course courseToBeRemoved = null;
            	System.out.println("Here is a list of all available course: " + Database.getInstance().getAllCourses());
               	System.out.println("Which one do you want to remove?");
               	String enteredCourseName = br.readLine();
            	for(Course c : Database.getInstance().getAllCourses()) {
            		if(c.getNameOfCourse().equals(enteredCourseName)) {
            			courseToBeRemoved = c;
            		}
            	}
            	   Database.getInstance().getAllCourses().remove(courseToBeRemoved);
            	   System.out.println("Course removed successfully!");
               }
           }
           Database.getInstance().saveDatabase();

   	  }
   }
    
    
}
