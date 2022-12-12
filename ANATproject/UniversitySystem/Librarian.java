package ANAT;

public class Librarian extends Employee {
    
    private Librarian tittle;
    private Database database;
    private Book book;

    private Librarian getTittle() {
        return this.tittle;
    }
    
    private Librarian setTittle(Librarian tittle) {
        this.tittle = tittle;
    }

    public Book getBook() {
        return this.book;
    }
    
   
    public Book setBook(Book book) {
        this.book = book;
    }

    public Database getDatabase() {
        return this.database;
    }
    
    public Database setDatabase(Database database) {
        this.database = database;
    }
    
    
    

    //                          Operations                                  
    
   
    public boolean checkID() {
        //TODO
        return false;
    }
    
   
    public boolean retrieveBook() {
        //TODO
        return false;
    }
    
   
    public boolean checkID(ID)() {
        //TODO
        return false;
    }
    
   
    public boolean checkID() {
        //TODO
        return false;
    }
}
