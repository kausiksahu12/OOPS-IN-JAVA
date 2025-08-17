package interface1;

public class CasiaCalculator implements Calculator {
	int a ;
	int b;
	public void add() {
		a = 10;
		b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public void mul() {
		a = 10;
		b = 80;
	    int c = a * b;
	    System.out.println(c);
	}
	
	public void sub() {
		a = 200;
		b = 100;
		int c = a - b;
		System.out.println(c);
	}
}
