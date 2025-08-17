package Oopsjava;

public class Employee1 {
	public static void main(String[] args) {
		Emplyee em1 = new Emplyee();
		Manager m1 = new Manager();
		Seniormanager s1 = new Seniormanager();
		em1.name = "Kausik";
		em1.EmpId = 101;
		m1.Department = "IT";
		m1.teamSize = 20;
		s1.hisDepartment = "Managitical";
		s1.EmpWorkUnder = 20;
		em1.Display();
		m1.Display();
		s1.Display();
	}

}
