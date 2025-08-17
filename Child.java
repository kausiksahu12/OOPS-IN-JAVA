package Oopsjava;

public class Child extends Parent {
	int a = 999;
	void display() {
		super.display();
		System.out.print("Displaying "+ a + "From Child");
		System.out.println("Displaying " +super.a + " From Child");
	}
}
