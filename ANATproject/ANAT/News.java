package ANAT;

public class News {
	
	private int newsID;
	private static int cnt;
	
    private String newsTitle;
    private String newsContent;
    
    {
    	this.newsID = cnt++;
    }
    
    public News(String title,String content) {
    	this.newsContent = content;
    	this.newsTitle = title;
    }
    
    public int getID() {
    	return newsID;
    }
    public String getNewsTitle() {
        return this.newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
    
    public String getNewsContent() {
        return this.newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    
}
