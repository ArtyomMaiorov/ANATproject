package ANAT;

import java.util.Vector;


public class Organization {
    private String nameOrganization;
    private Student head;
    private Student members;
    private Manager manager;
    private Student student;
    
    Vector<Student> members;
    {
    	  members = new Vector<Student>();
    }
    
    private String getNameOrganization() {
        return this.nameOrganization;
    }
   
    private String setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }
    
    private Student getHead() {
        return this.head;
    }
    
    private Student setHead(Student head) {
        this.head = head;
    }
    
    private Student getMembers() {
        return this.members;
    }
    
    private Student setMembers(Student members) {
        this.members = members;
    }
    
    public Manager getManager() {
        return this.manager;
    }
    
    public Manager setManager(Manager manager) {
        this.manager = manager;
    }
    
    public Student getStudent() {
        return this.student;
    }
    
    public Student setStudent(Student student) {
        this.student = student;
    }

    //                          Operations                                  
    public void addMembers(Student student) {
    	members.add(student);
    }
    
    public void showMembers() {
    	for(int i = 0; i < members.size(); i++) {
    		System.out.println(members.get(i));
    	}
    }

}
