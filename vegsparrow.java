package PolymorphismExample;

public class vegsparrow extends sparrow {
	public  vegsparrow(String name) {
		super(name);
	}
	void eat() {
		System.out.println(name + "The Sparrow is eating the veg.");
	}
}
