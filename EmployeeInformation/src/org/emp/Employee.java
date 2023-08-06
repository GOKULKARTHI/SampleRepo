package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public void empName() {
		
		System.out.println("Emplyee Name = Gokul Karthick");

	}
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Project pro = new Project();
		Client client = new Client();
		Company comp = new Company();
		
		emp.empName();
		pro.projectName();
		client.clientName();
		comp.companyName();
		
	}
	
	
}
