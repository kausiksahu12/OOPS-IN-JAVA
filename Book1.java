package Oopsjava;

public class Book1 {
	String titles;
	int pages;
	
	// Standard constructor 
	public Book1(String title , int pages) {
		this.titles = title;
		this.pages = pages;
	}
	
	// copy constructor
	
	public Book1(Book1 another) {
		this.titles = another.titles;
		this.pages = another.pages;
	}
	public void display() {
		System.out.println("Book: " + titles + ", Pages: " + pages);
	}
}
