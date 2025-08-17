package Oopsjava;

public class Student1 extends Person {
	int marks;
	String College;
	
	public Student1() {
		super("Rahul",29);
		System.out.println("Student Zero Parameterised Constructor Exec");
		marks = 35;
		College = "UVCE";
	}
	public Student1 (int marks) {
		this();
		System.out.println("Student singlr parameter constructor exec");
		this.marks = marks;
		College = "Kodnest";
	}
	public Student1(int marks, String College) { 
		this(95);
		System.out.println("Student 2 Parameter Constructor exec");
		this.marks = marks;
		this.College = College;
	}
}
