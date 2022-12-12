package ANAT;

public class Course {
    private String  nameOfCourse;
    private String  courseID;
    private Vector  instructors;
    private int     credits;
    private Vector  schedule;
    private Teacher teacher;
    private Lesson  lesson;
    private Student student;
    private Student student;
    
    private String getNameOfCourse() {
        return this.nameOfCourse;
    }

    private String setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }
 
    private String getCourseID() {
        return this.courseID;
    }

    private String setCourseID(String courseID) {
        this.courseID = courseID;
    }
 
    private Vector getInstructors() {
        return this.instructors;
    }
 
    private Vector setInstructors(Vector instructors) {
        this.instructors = instructors;
    }

    private int getCredits() {
        return this.credits;
    }
 
    private int setCredits(Integer credits) {
        this.credits = credits;
    }

    private Vector getSchedule() {
        return this.schedule;
    }
  
    private Vector setSchedule(Vector schedule) {
        this.schedule = schedule;
    }
 
    public Teacher getTeacher() {
        return this.teacher;
    }
  
    public Teacher setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
 
    public Lesson getLesson() {
        return this.lesson;
    }

    public Lesson setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Student getStudent() {
        return this.student;
    }
 
    public Student setStudent(Student student) {
        this.student = student;
    }
 
    public Student getStudent() {
        return this.student;
    }
 
    public Student setStudent(Student student) {
        this.student = student;
    }
    
    
    

    //                          Operations                                  

    public String toString() {
        //TODO
        return "";
    }
 
    public String viewInstructors() {
        //TODO
        return "";
    }
    
    public int hashCode() {
        //TODO
        return 0;
    }
    
    
}
