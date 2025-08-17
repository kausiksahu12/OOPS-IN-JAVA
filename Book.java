package Oopsjava;

public class Book {
	private int pageNo;
	// Setter
	public void setPageNo(int a) {
		if(a>0)
			pageNo=a;
		else {
			pageNo = 20;
			System.out.println("Page no can not be negative hence default value 20 will be assigned");
		}
	}
	//Getter
	public int getPageNo() {
		return pageNo;
	}
}
