package ANAT;

import java.util.Vector;

public class Organization {
	
    private String nameOrganization;
    private Student head;
    
    
    Vector<Student> members;
    {
        members = new Vector<Student>();
    }
    
    public Organization() {}
    
    public Organization(String name) {
    	this.nameOrganization = name;
    }
    
    public String getNameOrganization() {
        return this.nameOrganization;
    }
   
    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }
    
    public Student getHead() {
        return this.head;
    }
    
    public void setHead(Student head) {
        this.head = head;
    }
    
    //                          Operations 
    
    public void addMembers(Student student) {
    	members.add(student);
    }
    
    public void showMembers() {
      for(int i = 0; i < members.size(); i++) {
        System.out.println(members.get(i).toString());
      }
    }
    public String toString() {
    	return nameOrganization;
    }

}