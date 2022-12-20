package ANAT;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
	private User recipient;
    private User sender;
    private String subject;
    private String body;
    private boolean isRead;
    
    public Message(User sender,User recipient,String subject,String body,boolean isRead){
    	this.sender = sender;
    	this.recipient = recipient;
    	this.subject = subject;
    	this.body = body;
    	this.isRead = isRead;
    }
    
    public User getRecipient() {
        return this.recipient;
    }
    public void setRecipient(Employee recipient) {
        this.recipient = recipient;
    }
    
    public User getSender() {
        return this.sender;
    }
    
    public void setSender(Employee sender){
        this.sender = sender;
    }
    
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
    
	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	@Override
	public String toString() {
		return "Message [recipient=" + recipient + ", sender=" + sender + ", subject=" + subject + ", body=" + body
				+ "]";
	}
   
	
  
}
