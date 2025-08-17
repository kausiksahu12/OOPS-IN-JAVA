package interface1;

public interface Vehicle {
	void drive();
}

class Car implements Vehicle {
	public void drive() {
		System.out.println("Car is driving.");
	}
}

