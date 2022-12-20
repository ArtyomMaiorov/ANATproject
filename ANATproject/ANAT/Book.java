package ANAT;

import java.io.Serializable;
import java.util.Date;

/**
* @generated
*/
public class Book implements Serializable{
    
    /**
    * @generated
    */
    private int id;
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private String author;
    
    /**
    * @generated
    */
    private User ownedBy;
    
    /**
    * @generated
    */
    private int bookNum;
    
    /**
    * @generated
    */
    private Date dateOfPurchase;
    
    /**
    * @generated
    */
    private Date dateToBeReturned;
    

    /**
    * @generated
    */
    private int getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private void setId(Integer id) {
        this.id = id;
    }
    
    
    /**
    * @generated
    */
    private String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private void setName(String name) {
        this.name = name;
    }
    
    
    /**
    * @generated
    */
    private String getAuthor() {
        return this.author;
    }
    
    /**
    * @generated
    */
    private void setAuthor(String author) {
        this.author = author;
    }
    
    
    /**
    * @generated
    */
    private User getOwnedBy() {
        return this.ownedBy;
    }
    
    /**
    * @generated
    */
    private void setOwnedBy(User ownedBy) {
        this.ownedBy = ownedBy;
    }
    
    
    /**
    * @generated
    */
    private int getBookNum() {
        return this.bookNum;
    }
    
    /**
    * @generated
    */
    private void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }
    
    
    /**
    * @generated
    */
    private Date getDateOfPurchase() {
        return this.dateOfPurchase;
    }
    
    /**
    * @generated
    */
    private void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    
    
    /**
    * @generated
    */
    private Date getDateToBeReturned() {
        return this.dateToBeReturned;
    }
    
    /**
    * @generated
    */
    private void setDateToBeReturned(Date dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }  
}