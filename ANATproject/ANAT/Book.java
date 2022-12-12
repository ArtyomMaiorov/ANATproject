package ANAT;


/**
* @generated
*/
public class Book extends DatabaseLibrarian {
    
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
    private Librarian librarian;
    
    /**
    * @generated
    */
    private Student student;
    
    

    /**
    * @generated
    */
    private int getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private int setId(Integer id) {
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
    private String setName(String name) {
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
    private String setAuthor(String author) {
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
    private User setOwnedBy(User ownedBy) {
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
    private int setBookNum(Integer bookNum) {
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
    private Date setDateOfPurchase(Date dateOfPurchase) {
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
    private Date setDateToBeReturned(Date dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }
    
    
    
    /**
    * @generated
    */
    public Librarian getLibrarian() {
        return this.librarian;
    }
    
    /**
    * @generated
    */
    public Librarian setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public Student setStudent(Student student) {
        this.student = student;
    }
    
    
    
}
