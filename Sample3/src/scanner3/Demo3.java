package scanner3;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter Student Id ?");
		int studentId = sc.nextInt();
		
		System.out.println("Enter Student Name ?");
		String studentName = sc1.nextLine();
		
		System.out.println("Enter Student Email ?");
		String email = sc.next();
		
		System.out.println("Enter Student Phone Number ?");
		String phoneNo = sc.next();
		
		System.out.println("Enter Student Department ?");
		String dep = sc.next();
		
		System.out.println("Enter Student Gender ?");
		String gender = sc.next();
		
		System.out.println("Enter Student City ?");
		String city = sc.next();
		
		System.out.println("\n Student Detail:");
		System.out.println("---------------------");
		System.out.println("Student Id - "+studentId);
		System.out.println("Student Name - "+studentName);
		System.out.println("Student Phone Number - "+phoneNo);
		System.out.println("Student Department - "+dep);
		System.out.println("Student Gender - "+gender);
		System.out.println("Student City - "+city);
	}
	

}
