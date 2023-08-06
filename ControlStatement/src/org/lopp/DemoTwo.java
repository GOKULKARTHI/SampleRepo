package org.lopp;

import java.util.Scanner;

public class DemoTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even NUmber");

		} else {
			System.out.println("Odd Number");

		}

	}

}
