package ANAT;

import java.io.Serializable;
import java.util.Date;

/**
* @generated
*/
public class Book implements Serializable{
	private int id;
	private String name;
	private String author;
	private User ownedBy;
	private int bookNum;
	private Date dateOfPurchase;
	private Date dateToBeReturned;
    
    //getter/setter
	public int getId() {
        return this.id;
    }
	public void setId(int id) {
        this.id = id;
    }
	public String getName() {
        return this.name;
    }
	public void setName(String name) {
        this.name = name;
    }
	public String getAuthor() {
        return this.author;
    }
	public void setAuthor(String author) {
        this.author = author;
    }
	public User getOwnedBy() {
        return this.ownedBy;
    }
	public void setOwnedBy(User ownedBy) {
        this.ownedBy = ownedBy;
    }
	public int getBookNum() {
        return this.bookNum;
    }
	public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }
	public Date getDateOfPurchase() {
        return this.dateOfPurchase;
    }
	public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
	public Date getDateToBeReturned() {
        return this.dateToBeReturned;
    }
	public void setDateToBeReturned(Date dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }  
}