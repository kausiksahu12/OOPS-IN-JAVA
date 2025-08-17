package PolymorphismExample;

public abstract class sparrow extends sky {
	String name ;
	public sparrow(String name) {
		this.name = name;
	}
	void fly() {
		System.out.println(name + "The Sparow is flying in the sky.");
	}

}
