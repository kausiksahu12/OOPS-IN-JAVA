package Oopsjava;

public class Charger {
	String brand;
	int watts;
	
	public Charger(String brand, int watts) {
		super();
		this.brand = brand;
		this.watts = watts;
	}
	void charge() {
		System.out.println("Charger is charging the phone ");
	}
}
