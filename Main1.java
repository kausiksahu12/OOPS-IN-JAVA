package interface1;

public class Main1 {
	
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();
		
		Animal myCat = new Cat();
		myCat.makeSound();
	}
}