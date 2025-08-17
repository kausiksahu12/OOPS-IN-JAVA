package PolymorphismExample;

public abstract class Eagle extends sky {
	String name;
	public Eagle(String name) {
		this.name = name;
	}
	
	void fly() {
		System.out.println(name + "THe Eagle is flying");	
		}
}
