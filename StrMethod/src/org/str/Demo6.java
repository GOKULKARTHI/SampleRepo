package org.str;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// 8.1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 value");
		String s = sc.next();
		System.out.println(s.toLowerCase());

		// 8.2
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String value 2");
		String m = sc1.next();
		System.out.println(m.toUpperCase());

		// 8.4
		
		String sr = "WelComeToJava";
		int Upper = 0, lower = 0;
		for(int i = 0; i<sr.length();i++)
		{
			char c = sr.charAt(i);
			if (c >='A' && c <='Z') {
				Upper++;
			} else if (c>='a'&& c<='z'){
				lower++;
				
			}

		}
		System.out.println("Upper Case : "+Upper);
		System.out.println("Lower Case : "+lower);
		
		
		
		
	}

}
