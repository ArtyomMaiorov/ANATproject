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
    
    private String getNameOrganization() {
        return this.nameOrganization;
    }
   
    private String setNameOrganization(String nameOrganization) {
        return this.nameOrganization = nameOrganization;
    }
    
    private Student getHead() {
        return this.head;
    }
    
    private Student setHead(Student head) {
        return this.head = head;
    }
    
    //                          Operations 
//    public void addOrganizations(Organization organization) {
//      listOfOrganizations.add(organization);
//    }
//    public void showAllOrganizations() {
//        for(int i = 0; i < listOfOrganizations.size(); i++) {
//          System.out.println(listOfOrganizations.get(i));
//        }
//        }

    
    public void addMembers(Student s) {
      this.members.add(s);
    }
    
    public void showMembers() {
      for(int i = 0; i < members.size(); i++) {
        System.out.println(members.get(i).getFirstName());
      }
    }
    public String toString() {
      return nameOrganization;
    }

}