package org.str;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
     // for 5.1 
		System.out.println("Enter your Email Address ?");
		String s1 = sc.next();

		if (s1.contains("@")) {
			System.out.println("valid email id");
		} else {

			System.out.println("Invalid email id");
		}
           //for 5.2
		System.out.println("Enter you Address ?");
		String S2 = sc.next();

		if (S2.contains("pincode")) {

			System.out.println("Valid Addree");

		} else {

			System.out.println("Invalid Address");
		}
       //For 5.3
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter your Email Id ?");

		String s2 = sc1.next();
		boolean u = s2.contains("@");

		System.out.println(u);
        //For 5.4
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Phone Number ?");
		String s3 = sc2.next();
		boolean m = s3.contains("");
		
		if (m == true) {

			System.out.println(false);
		}

		sc.close();
		sc1.close();

	}

}
