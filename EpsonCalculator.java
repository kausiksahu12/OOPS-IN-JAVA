package interface1;
import java.util.Scanner;

public class EpsonCalculator implements Calculator{
	int a; 
	int b;
	
	Scanner sc = new Scanner(System.in);
	public void add() {
		System.out.println("Enetr the a and b number and add them: ");
		a = sc.nextInt();
		b= sc.nextInt();
		int c = a+b;
		System.out.println("The Result is: "  + c);
	}
	
	public void mul() {
		System.out.println("Enetr the a and b number and multipy them: ");
		a = sc.nextInt();
		b= sc.nextInt();
		int c = a*b;
		System.out.println("The Result is: "  + c);
	}
	
	public void sub() {
		System.out.println("Enetr the a and b number and substract them: ");
		a = sc.nextInt();
		b= sc.nextInt();
		int c = a-b;
		System.out.println("The Result is: "  + c);
	}
}
