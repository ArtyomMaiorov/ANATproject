package ANAT;
public class Mark {
    private Course courseName;
    private double points;
    private double firstAtt;
    private double secondAtt;
    private double finalScore;
    private double totalAtt;
    private String letterGrade;
    private Teacher teacher;
    private Database database;
    private Student student;
    
    //setter/getter
    public Course getCourseName() {
        return this.courseName;
    }
    public void setCourseName(Course courseName) {
        this.courseName = courseName;
    }
    public double getPoints() {
        return this.points;
    }
    public void setPoints(double points) {
        this.points = points;
    }
    public double getFirstAtt() {
        return this.firstAtt;
    }
    public void setFirstAtt(double firstAtt) {
        this.firstAtt = firstAtt;
    }
    public double getSecondAtt() {
        return this.secondAtt;
    }
    public void setSecondAtt(double secondAtt) {
        this.secondAtt = secondAtt;
    }
    public double getFinalScore() {
        return this.finalScore;
    }
    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
    public double getTotalAtt() {
        return this.totalAtt;
    }
    public void setTotalAtt(double totalAtt) {
        this.totalAtt = totalAtt;
    }
    public String getLetterGrade() {
        return this.letterGrade;
    }
    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
    public Teacher getTeacher() {
        return this.teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Student getStudent() {
        return this.student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Database getDatabase() {
        return this.database;
    }
    public void setDatabase(Database database) {
        this.database = database;
    }
    
    

    //                          Operations                                  
    
    public String convertToNumber() {
        //TODO
        return "";
    }
    
    public double getTotalPoints() {
        //TODO
        return 0.0;
    }
    
    public String getLetterScore() {
        //TODO
        return "";
    }
    
    
}
