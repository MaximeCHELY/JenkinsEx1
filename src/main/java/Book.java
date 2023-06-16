import java.util.Date;

public class Book {
	private String title;
	private String author;
	private String date;
	
	public Book() {
		this.title = "";
		this.author = "";
		this.date = "01-01-1970";
	}
	
	public Book(String title, String author, String date) {
		this.title = title;
		this.author = author;
		this.date = date;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.title = author;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.title = date;
	}
}
