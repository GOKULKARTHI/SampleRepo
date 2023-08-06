package org.edu;

public class Arts extends Education {

	public void bSc() {

		System.out.println("1.Bachelor of Science");
	}

	public void bEd() {
		System.out.println("2.Bachelor of Education");

	}

	public void bA() {
		System.out.println("3.Bachelor of Arts");
	}

	public void bBA() {
		System.out.println("4.Bacelor of Bussiness Application");

	}

	public void ug() {

		System.out.println("Under Graduate");

	}

	public void pg() {
		
		System.out.println("Post Graduate");

	}
	public static void main(String[] args) {
		
		Arts a = new Arts();
		a.ug();
		a.bSc();
		a.bEd();
		a.bA();
		a.bBA();
		System.out.println("--------------------------");
		a.pg();
		System.out.println("None");
	}
}
