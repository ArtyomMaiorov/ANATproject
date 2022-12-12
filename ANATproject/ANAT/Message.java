package ANAT;


/**
* @generated
*/
public class Message {
    
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
    public Employee setRecipient(Employee recipient) {
        this.recipient = recipient;
    }
    

    private Employee getSender() {
        return this.sender;
    }
    private Employee setSender(Employee sender) {
        this.sender = sender;
    }
    
    
    private String getContent() {
        return this.content;
    }
    private String setContent(String content) {
        this.content = content;
    }
    
}
