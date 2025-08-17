package Oopsjava;

public class StudentDetails1 {
	private int id;
	private String Name;
	private String Gender;
	private int marks;
	
	public StudentDetails1 (int a , String n , String g , int m) {
		if(a>0) {
			id = a;
		}
		if(n.length() != 0) {
			Name = n;
		}
		Gender = g;
		if(m>0) {
			marks = m;
		}
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getGender() {
		return Gender;
		
	}
	public int getMarks() {
		return marks;
	}
}