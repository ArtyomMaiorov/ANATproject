package ANAT;

import java.io.Serializable;

public class Message implements Serializable {
    
    private Employee recipient;
    private Employee sender;
    private String content;
    
    public Message(){}
    //request
    public Message(Employee sender,String message){
    	this.sender = sender;
    	this.content = content;
    }
    
    //messages for other employees
    public Message(Employee sender,Employee recipient,String message){
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
    
    private Employee getSender() {
        return this.sender;
    }
    
    private void setSender(Employee sender){
        this.sender = sender;
    }
    
    private String getContent() {
        return this.content;
    }
    private void setContent(String content) {
        this.content = content;
    }
    
    public String toString() {
    	return sender.toString() + "\nMessage:\n" + content + "\n";
    }
}
