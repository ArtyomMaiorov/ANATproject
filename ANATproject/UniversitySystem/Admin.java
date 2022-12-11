package ANAT;
public class Admin extends User {
    private UserFactory userFactory;
    private Manager manager;
    private Database database;
    

    public Manager getManager() {
        return this.manager;
    }
    
    /**
    * @generated
    */
    public Manager setManager(Manager manager) {
        this.manager = manager;
    }
    
    
    /**
    * @generated
    */
    public UserFactory getUserFactory() {
        return this.userFactory;
    }
    
    /**
    * @generated
    */
    public UserFactory setUserFactory(UserFactory userFactory) {
        this.userFactory = userFactory;
    }
    
    
    /**
    * @generated
    */
    public Database getDatabase() {
        return this.database;
    }
    
    /**
    * @generated
    */
    public Database setDatabase(Database database) {
        this.database = database;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void addUser() {
        //TODO
    }
    
    /**
    * @generated
    */
    public String seeLogFiles() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public String toString() {
        //TODO
        return "";
    }
    
    
}
