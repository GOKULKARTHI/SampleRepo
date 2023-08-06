package org.college;

public class Student extends dept {

	public void studentName() {

		System.out.println("Student Name - Gokul Karthick");
	}

	public void studentDept() {

		System.out.println("Student Department - Mechanical Department");

	}

	public void studentId() {

		System.out.println("Student Id - 7303410114023");
	}

	public static void main(String[] args) {

		Student info = new Student();

		info.collegeName();
		info.collegecode();
		info.collegerank();
		info.deptName();
		System.out.println("--------------------------------------");
		System.out.println("");
		info.studentName();
		info.studentId();
		info.studentDept();

	}
}
