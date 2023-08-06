package scanner;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Employee Id ?");
		int empId = sc.nextInt();

		System.out.println("Enter  Employee Name ?");
		String empName = sc.next();

		System.out.println("Enter Employee Phone Number ?");
		long empPhoneno = sc.nextLong();

		System.out.println("Enter Email Address ?");
		String empEmail = sc.next();

		System.out.println("Enter Employee Salary ?");
		double empSalary = sc.nextDouble();

		System.out.println("Enter Employee Gender ?");
		String empGender = sc.next();

		System.out.println("Enter Employee City ?");
		String empCity = sc.next();

		System.out.println("Employee Id  = " + empId);
		System.out.println("Employee Name = " + empName);
		System.out.println("Employee Phone Number = " + empPhoneno);
		System.out.println("Email Address = " + empEmail);
		System.out.println("Employee Salary = " + empSalary);
		System.out.println("Employee Gender = " + empGender);
		System.out.println("Employee City = " + empCity);
		sc.close();
	}

}
