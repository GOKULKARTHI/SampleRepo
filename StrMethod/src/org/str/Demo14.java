package org.str;

public class Demo14 {

	public static void main(String[] args) {

		String sr = "Welcome";

		String m = sr.replaceAll("[aeiouAEIOU]", "@");

		System.out.println(m);

	}

}
