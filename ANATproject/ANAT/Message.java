package ANAT;

import java.io.Serializable;

public class Message implements Serializable {
    
    private static final long serialVersionUID = 1L;
	private Employee recipient;
    private Employee sender;
    private String content;
    
    public Message(){}
    //request
    public Message(Employee sender,String content){
    	this.sender = sender;
    	this.content = content;
    }
    
    //messages for other employees
    public Message(Employee sender,Employee recipient,String content){
    	this.sender = sender;
    	this.recipient = recipient;
    	this.content = content;
    }
    
    public Employee getRecipient() {
        return this.recipient;
    }
    public void setRecipient(Employee recipient) {
        this.recipient = recipient;
    }
    
    public Employee getSender() {
        return this.sender;
    }
    
    public void setSender(Employee sender){
        this.sender = sender;
    }
    
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    public String toString() {
    	return sender.toString() + "\nMessage:\n" + content + "\n";
    }
}
