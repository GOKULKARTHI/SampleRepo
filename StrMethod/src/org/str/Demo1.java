package org.str;

public class Demo1 {

	public static void main(String[] args) {

		String s1 = ("GreensTechnology");
		String s2 = ("SeleniumAutomationtool");
		String s3 = ("velmurugan");
		String s4 = ("j a v a p r o g r a m");
		String s5 = ("9095484678");

		int a = s1.length();
		int b = s2.length();
		int c = s3.length();
		int d = s4.length();
		int e = s5.length();

		System.out.println("Length of String 1 is " + a);
		System.out.println("Length of String 2 is " + b);
		System.out.println("Length of String 3 is " + c);
		System.out.println("Length of String 4 is " + d);
		System.out.println("Length of String 5 is " + e);
		System.out.println("----------------------------------------");

		int f = s1.lastIndexOf("o");
		int g = s2.indexOf("o");
		int h = s3.indexOf("n");
		int i = s4.lastIndexOf(" ");
		int j = s5.indexOf("8");

		System.out.println("Last Index of  o in " + s1 + " is " + f);
		System.out.println("Index of o in" + s2 + " is " + g);
		System.out.println("Index of n in " + s3 + " is " + h);
		System.out.println("Last Index of emptyspace in " + s4 + " is " + i);
		System.out.println("Index of 8 in " + s5 + " is " + j);
		
		System.out.println("---------------------------------------------");

		char k = s1.charAt(s1.indexOf("h"));
		char l = s2.charAt(s2.indexOf("o"));
		char m = s3.charAt(s3.indexOf("u"));
		char n = s4.charAt(s4.indexOf("p"));
		char o = s5.charAt(s5.indexOf("7"));
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

		Gokul karthick
		
		
				
		
	}

}
