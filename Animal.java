package interface1;

public interface Animal {
	void makeSound(); // Abstract methood with no code
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("Bark");	
	}
}

class Cat implements Animal {
	public void makeSound() { 
		System.out.println("Meow");
	}
}
