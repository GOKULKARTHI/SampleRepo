package org.str;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
      //6.1  
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Phone Number ?");
		String phoneno = sc.next();

		if (phoneno.length() > 10) {
			System.out.println("Invalid Phone Number");

		}else {
			
			System.out.println("Valid");
		}

	}

}
