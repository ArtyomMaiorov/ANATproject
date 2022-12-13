package ANAT;

import java.util.*;
public class Employee extends User {

    private int ID;
    private int salary;
    private Database database;
    private Vector messages;
    
    public int getID() {
        return this.ID;
    }
    
    public int setID(Integer ID) {
        this.ID = ID;
    }
    
    public int getSalary() {
        return this.salary;
    }
    
    public int setSalary(Integer salary) {
        this.salary = salary;
    }
    
    private int getSalary() {
        return this.salary;
    }
    
    private int setSalary(Integer salary) {
        this.salary = salary;
    }
    
    public void addMessage(Message message) {
    	messages.add(message);
    }
    
    //                          Operations                                  
    
    public void sendMessage(int employeeID,String content) {
    	Message message = new Message(getID(),content);
    	database.addMessage(employeeID,message);
    }
    public void readMessagrs() {
    	LinkedList<Message> list = database.getMessages(getID());
    	Iterator it = list.iterator();
    	while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
    
    public String toString() {
		return ID + " " + firstName + " " + lastName + " " + middleName + " ";
	}
    
}
