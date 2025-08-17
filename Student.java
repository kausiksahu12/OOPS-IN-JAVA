package Oopsjava;

public class Student {
	private int id;
	private String name;
	private String marks;
	
	public void setStudent(int id , String name , String marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	public  String getNm() {
		return name;
	}
	public String getMarks() {
		return marks;
	}
}
