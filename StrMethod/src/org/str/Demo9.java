package org.str;

public class Demo9 {

	public static void main(String[] args) {

		// 11.1 for literals

		String s1 = "Nisha";
		String s2 = "Nisha";

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		// 11.2 For non literals
		String s3 = new String("Nisha");
		String s4 = new String("Nisha");

		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		// 11.3
		String s5 = new String("Nisha");
		String s6 = new String("Rengan");
		String s7 = new String("NishaRengan");

		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(s7));

		System.out.println("-----------------------------------");

		String s8 = "Nisha";
		String s9 = "Rengan";
		String s10 = "NishaRengan";

		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		System.out.println(System.identityHashCode(s10));

	}

}
