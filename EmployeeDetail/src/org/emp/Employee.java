package org.emp;

public class Employee {

	public void empId() {
		
		System.out.println("Employee Id - 2526");
	}
	public void empId(int age) {
		
		System.out.println("Employee age - " + age);
		
		
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empId();
		emp.empId(25);
	}
	
	
}
