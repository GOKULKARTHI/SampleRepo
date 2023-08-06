package org.str;

public class Demo7 {

	public static void main(String[] args) {

		// 9.1
		String str = "Welcome to java class";
		boolean m = str.startsWith("Welcome");
		System.out.println(m);

		// 9.2
		String str1 = "Hai i am nisha";
		boolean n = str1.startsWith("welcome");
		System.out.println(n);

		// 9.3
		boolean o = str.endsWith("class");
		System.out.println(o);

		// 9.4
		boolean p = str.endsWith("java");
		System.out.println(p);

		// 9.5
		boolean q = str.isEmpty();
		System.out.println(q);
		
		//9.6
		String str2 = " ";
		boolean r = str2.isEmpty();
		System.out.println(r);

	}
}