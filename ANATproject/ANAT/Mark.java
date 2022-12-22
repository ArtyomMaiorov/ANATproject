package ANAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Mark implements Serializable{

	private static final long serialVersionUID = 1L;
	private double points; // /100
    private double firstAtt; // /30
    private double secondAtt; // /30
    private double finalScore; // /40
    private double totalAtt; // /60
    private String letterGrade;
    
    
    //setter/getter
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
   
    public Mark() {};
    
    public Mark(boolean flag) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st attestation points");
		this.firstAtt = Double.parseDouble(br.readLine());
		System.out.println("Enter 2nd attestation points");
		this.secondAtt = Double.parseDouble(br.readLine());
		System.out.println("Enter final score");
		this.finalScore = Double.parseDouble(br.readLine());
		this.totalAtt = this.firstAtt + this.secondAtt;
		this.points = this.totalAtt + this.finalScore;
		
    }
    public Mark(double firstAtt) {
		super();
		this.firstAtt = firstAtt;
	}
    
	public Mark(double firstAtt, double secondAtt, double totalAtt) {
		super();
		this.firstAtt = firstAtt;
		this.secondAtt = secondAtt;
		this.totalAtt = totalAtt;
	}
	
	public Mark(double points, double firstAtt, double secondAtt, double finalScore, double totalAtt) {
		super();
		this.points = points;
		this.firstAtt = firstAtt;
		this.secondAtt = secondAtt;
		this.finalScore = finalScore;
		this.totalAtt = totalAtt;
	}
	
    public Mark(double points, double firstAtt, double secondAtt, double finalScore, double totalAtt,
			String letterGrade) {
		super();
		this.points = points;
		this.firstAtt = firstAtt;
		this.secondAtt = secondAtt;
		this.finalScore = finalScore;
		this.totalAtt = totalAtt;
		this.letterGrade = letterGrade;
	}
    
    //  Operations                                  
    
    
	public String convertToGrade() {
        if(points >= 90 && points <= 100) {
        	return "A";
        } else if (points >= 80 && points <= 89) {
            return "B";
        } else if (points >= 70 && points <= 79) {
            return "C";
        } else if (points >= 60 && points <= 69) {
            return "D";
        } else if (points >= 0 && points <= 59) {
            return "F";
        } else {
            return "Error: Invalid number of points.";
        }
        
    }
    
    public double getTotalPoints() {
        return this.points;
    }
    
    public String getLetterScore() {
        return this.letterGrade;
    }
	@Override
	public String toString() {
		return "Mark [points=" + points + ", letterGrade=" +  convertToGrade()
				+ "]";
	}
    
    
    
}
