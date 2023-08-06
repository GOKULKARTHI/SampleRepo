package org.str;

public class Demo10 {

	public static void main(String[] args) {

		// 12.1
		String str = "Welcome to java class";
		String[] m = str.split("\\s+");

		for (String a : m)
			System.out.println(a);

		//12.2
		String[] n = str.split("l");
		for (String b : n)
			System.out.println(b);
         
		
	}

}
