package Oopsjava;

public class Employee {
	private int id;
	private String name;
	private int salaray;
	
	public Employee(int a , String b , int c) {
		if (a>0) {
			id = a;
		}
		if(b.length() != 0) {
			name = b;
		}
		if(c>0) {
			salaray = c;
		}
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salaray;
	}
}
