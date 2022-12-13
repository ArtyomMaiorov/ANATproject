package ANAT;

import java.util.*;
public class Employee extends User {

    private int salary;
    private Database database;
    private Vector messages;
    
 
    
    public int getSalary() {
        return this.salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void addMessage(Message message) {
    	messages.add(message);
    }
    
    //                          Operations                                  
    
    public void sendMessage(int employeeID,String content) {
    	Message message = new Message(super.getID,content);
    	database.addMessage(employeeID,message);
    }
    public void readMessagrs() {
    	LinkedList<Message> list = database.getMessages(getID());
    	Iterator it = list.iterator();
    	while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

	@Override
	public String toString() {
		return "Employee[ " + [super.toString() " + "salary=" + salary + ", database=" + database + ", messages=" + messages + "]";
	}
    
    
}
