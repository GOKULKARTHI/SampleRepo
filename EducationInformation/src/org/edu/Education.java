package org.edu;

public class Education extends Medicine {
	public void ug() {

		System.out.println("UG Department");

	}

	public void pg() {

		System.out.println("PG Department");
	}

	public static void main(String[] args) {

		Education edu = new Education();
  edu.ug();
  edu.bsc();
  edu.bA();
  edu.bBa();
  edu.bED();
  System.out.println("-------------------------");
  System.out.println("Engineering Department");
  edu.bE();
  edu.bTech();
  System.out.println("--------------------------");
  System.out.println("Medical Department");
  edu.physiyo();
  edu.dental();
  System.out.println("--------------------------");
  edu.pg();
  edu.mbbs();
  
	}

}
