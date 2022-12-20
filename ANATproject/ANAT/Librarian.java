package ANAT;

import java.io.IOException;

public class Librarian extends Employee {
	private static final long serialVersionUID = 1L;
	private Librarian tittle;
    private Database database;
    private Book book;
    
   public Librarian() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
   
    public Librarian getTittle() {
        return this.tittle;
    }
    public void setTittle(Librarian tittle) {
        this.tittle = tittle;
    }
    public Book getBook() {
        return this.book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Database getDatabase() {
        return this.database;
    }
    public void setDatabase(Database database) {
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
      
}
