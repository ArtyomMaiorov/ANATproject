package ANAT;


public class Transcript {
 
    private String firstName;
    
    private String studentSurname;
    
    /**
    * @generated
    */
    private Multimap coursesMarks;
    //TODO implement multi map
    public String getFirstName() {
  		return firstName;
  	}

  	public void setFirstName(String firstName) {
  		this.firstName = firstName;
  	}

  	public String getStudentSurname() {
  		return studentSurname;
  	}

  	public void setStudentSurname(String studentSurname) {
  		this.studentSurname = studentSurname;
  	}

  	public Multimap getCoursesMarks() {
  		return coursesMarks;
  	}

  	public void setCoursesMarks(Multimap coursesMarks) {
  		this.coursesMarks = coursesMarks;
  	}
    

    

    

    //                          Operations                                  
    
  

	/**
    * @generated
    */
    public Transcript getTranscript() {
        //TODO
        return this;
    }
    
    /**
    * @generated
    */
    public double calculateGPA() {
        //TODO
        return 0.0;
    }
    
    
}
