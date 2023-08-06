package org.str;

import java.util.Scanner;

public class demo8 {

	public static void main(String[] args) {

		// 10.1 & 10.2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String m = sc.next();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String 2");
		String n = sc1.next();

		System.out.println(m.compareTo(n));

	}

}
