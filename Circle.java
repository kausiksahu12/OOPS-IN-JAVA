package PolyPackage;
import java.util.Scanner;

public class Circle {
	double pi = 3.14;
	double area;
	
	public void Acceptinput() {
		System.out.println("It is accept input: ");
	}
	
	public void calculateArea() {
		System.out.println("Here the calculate area is: ");
	}
	
	public void displayArea() {
		System.out.println("The area is: " + area);
	}

}
class circlearea extends Circle {
	int radius;
	
	public void Acceptinput() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: " );
		radius = sc.nextInt();
	}
	
	public void calculateArea() {
		area = pi * radius * radius;
	}
}
class square extends Circle {
	int length;
	
	public void Acceptinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Square: ");
		length = sc.nextInt();
	}
	
	public void calculateArea() {
		area = length * length;
	}
}

class rectangle extends Circle {
	int length;
	int breath;
	
	
	public void Acceptinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle: ");
		System.out.println("Enter the breath of the Rectangle:  ");
		length = sc.nextInt();
		breath = sc.nextInt();
	}
	public void calculateArea() {
		area = length * breath ;
	}
}

