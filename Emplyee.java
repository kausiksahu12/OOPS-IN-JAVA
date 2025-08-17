package Oopsjava;

public class Emplyee {
	String name;
	int EmpId;	
	public void Display() {
		System.out.println("Employee Name: " + name + "  Employee ID: "+ EmpId);
		}
}
class Manager extends Emplyee {
	String Department;
	int teamSize;	
	public void Display() {
		System.out.println("The Department of the company is: " + Department + " The Team Size is: " + teamSize );
	}
}
class Seniormanager extends Manager {
	String hisDepartment;
	int EmpWorkUnder;
	public void Display() {
		System.out.println("The His Department is: " + hisDepartment + " Here the total Employee working under" + EmpWorkUnder);	
	}
}

