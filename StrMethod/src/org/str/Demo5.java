package org.str;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// 7.1
		String s = "Welcome to class java";

		String m = s.replace("java", "sql");
		System.out.println(m);

		// 7.2
		String s1 = "Greens Adayar";
		String n = s1.replace("Adayar", "Omr");

		System.out.println(n);

		// 7.3
		String o = s.replaceAll(" ", "#");
		System.out.println(o);

		// 7.4
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Email Address");
		String mail = sc.next();
		if (mail.contains("gmail")) {

			System.out.println(mail.replace("gmail", "Yahoo"));
		}

		// 7.5
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your Address");
		String address = sc1.next();
		
		if (address.contains("pincode")){

			System.out.println(address.replaceAll(",pincode-626101"," "));
			
		}

	}

}
