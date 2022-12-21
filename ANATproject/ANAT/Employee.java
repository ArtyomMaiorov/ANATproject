package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Employee extends User {
    private static final long serialVersionUID = 1L;
	private int salary;
    private Database database;
    
    //getter/setter
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    } 
    
    //constructor
    public Employee() throws IOException {
		super();
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter Employee's salary");
		this.salary= br.read();
	}


    //                          Operations                                  
    
    
//    public void writeRequest(Employee other,String content) {
//    	Message message = new Message(other,content);
//    	database.addMessage(other.getID(),message);
//    }
//    
//    public void sendMessage(Employee other,String content) {
//    	Message message = new Message(other,content);
//    	database.addMessage(other.getID(),message);
//    }
//    public void readMessagrs() {
//    	LinkedList<Message> list = database.getMessages(getID());
//    	Iterator it = list.iterator();
//    	while(it.hasNext()){
//            System.out.println(it.next().toString());
//        }
//    }

    
    //                              Override
    public String toString() {
		return super.toString() + "salary:"+getSalary();
	}
	@Override
	public void showInterface() throws IOException {
		// TODO Auto-generated method stub
		
	}

	
    
}
