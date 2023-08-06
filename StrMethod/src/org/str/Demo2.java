package org.str;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String 1 Value ?");
		String s1 = sc.next();

		System.out.println("Enter String 2 Value ?");
		String s2 = sc.next();
		boolean u = s1.equals(s2);
		boolean m = s1.equalsIgnoreCase(s2);

		System.out.println(u);
		System.out.println(m);
		
		sc.close();
	}

 
}
