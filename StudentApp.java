package Oopsjava;

public class StudentApp {
	public static void main(String[] args) {
		StudentDetails1 s = new StudentDetails1(1, "Hrusikesh", "LGBTQ", 32  );
		System.out.println("Id: " +s.getid() + "\nName: " + s.getName() + "\nGender: " + s.getGender() + "\nMarks: "+s.getMarks());
	}
}
