package ANAT;
import java.util*;
public class Book extends DatabaseLibrarian {
    
    private int id;
    private String name;
    private String author;
    private User ownedBy;
    private int bookNum;
    private Date dateOfPurchase;
    private Date dateToBeReturned;
    private Librarian librarian;
    private Student student;
    

    private int getId() {
        return this.id;
    }
    
    private int setId(Integer id) {
        this.id = id;
    }
    
    
   
    private String getName() {
        return this.name;
    }
   
    private String setName(String name) {
        this.name = name;
    }
  
    private String getAuthor() {
        return this.author;
    }
  
    private String setAuthor(String author) {
        this.author = author;
    }
 
    private User getOwnedBy() {
        return this.ownedBy;
    }
  
    private User setOwnedBy(User ownedBy) {
        this.ownedBy = ownedBy;
    }
  
    private int getBookNum() {
        return this.bookNum;
    }
  
    private int setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }
 
    private Date getDateOfPurchase() {
        return this.dateOfPurchase;
    }
  
    private Date setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    private Date getDateToBeReturned() {
        return this.dateToBeReturned;
    }
 
    private Date setDateToBeReturned(Date dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }
    
    
    
   
    public Librarian getLibrarian() {
        return this.librarian;
    }
   
    public Librarian setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    public Student getStudent() {
        return this.student;
    }
    public Student setStudent(Student student) {
        this.student = student;
    }
    
    
    
}
