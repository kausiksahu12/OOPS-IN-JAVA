package Oopsjava;

public class Library {
	public static void main(String[] args) {
		Book1 originalBook = new Book1("Java Fundamentals",300);
		originalBook.display();
		
		Book1 copiedBook = new Book1(originalBook);
		copiedBook.display();
		
		copiedBook.pages = 350;
		
		System.out.println("After modifying the copied book: ");
		copiedBook.display();
		originalBook.display();
	}

}
