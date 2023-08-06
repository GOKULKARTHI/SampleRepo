package org.six;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demosix1 extends EmpDetail {

	public Demosix1(int empId, String name, long phone, String address, String dob, String doj, String eMail,
			String gender, double sal) {
		super(empId, name, phone, address, dob, doj, eMail, gender, sal);

	}

	public static void main(String[] args) {
		Set<EmpDetail> empset = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the employeeId: ");
			int empId = scanner.nextInt();
			System.out.println("Enter the name: ");
			String name = scanner.next();
			System.out.println("Enter the phone: ");
			long phone = scanner.nextLong();
			System.out.println("Enter the address: ");
			String address = scanner.next();
			System.out.println("Enter the date of birth: ");
			String dob = scanner.next();
			System.out.println("Enter the date of joining: ");
			String doj = scanner.next();
			System.out.println("Enter the email: ");
			String eMail = scanner.next();
			System.out.println("Enter the gender: ");
			String gender = scanner.next();
			System.out.println("Enter the salary: ");
			double sal = scanner.nextDouble();
			EmpDetail empDetails = new EmpDetail(empId, name, phone, address, dob, doj, eMail, gender, sal);
			empset.add(empDetails);
		}
		System.out.println("EmpDetails Set : " + empset);
		scanner.close();
	}
}
