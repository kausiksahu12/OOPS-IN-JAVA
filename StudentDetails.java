package Oopsjava;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setStudent(100,"Kausik","200");
		System.out.println("The student ID: " +s.getId()+"Student name: " +s.getNm()+"Student marks" +s.getMarks());
	}

}
