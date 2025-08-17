package Oopsjava;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee e = new Employee(12,"Kausik", 56000);
		System.out.println("Id: " +e.getid() + "Name: " + e.getName() + "Salary: " + e.getSalary());
	}
}
