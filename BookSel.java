package Oopsjava;

public class BookSel {
	public static void main(String[] args) {
		Book b = new Book();
		//b.pageNo = -100;
		// System.out.println("book with pageNo " +b.pageNo+"costs 999rs")
		b.setPageNo(-100);
		System.out.println("Book with pageNo " + b.getPageNo()+"costs 999rs");
	}
	

}
