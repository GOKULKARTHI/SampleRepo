package scanner2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Id ?");
		int studentId = sc.nextInt();
		
		System.out.println("Enter Student Name ?");
		String studentName = sc.next();
		
		System.out.println("Enter Mark 1 ?");
		int mark1 = sc.nextInt();
		
		System.out.println("Enter Mark 2 ?");
		int mark2 = sc.nextInt();
		
		System.out.println("Enter mark 3 ?");
		int mark3 = sc.nextInt();
		
		System.out.println("Enter Mark 4 ?");
		int mark4 = sc.nextInt();
		
		System.out.println("Enter Mark 5 ?");
		int mark5 = sc.nextInt();
		
		System.out.println("Student Id  - " + studentId);
		System.out.println("Student Name  - " + studentName);
		System.out.println("Mark 1 - " + mark1);
		System.out.println("Mark 2 - " + mark2);
		System.out.println("Mark 3 - " + mark3);
		System.out.println("Mark 4 - " + mark4);
		System.out.println("Mark 5 - " + mark5);
		System.out.println("Total Marks = " + (mark1 + mark2 + mark3 + mark4 + mark5));
		
		int a = +mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.println("Avrage Mark = " + a / 5);

	}

}
