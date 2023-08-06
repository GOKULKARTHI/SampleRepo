package org.str;

public class Demo13 {

	public static void main(String[] args) {

		String sr = "Welcome To Java class @123";

		int upper = 0, lower = 0, spl = 0, num = 0;

		for (int i = 0; i < sr.length(); i++) {
			char ch = sr.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;

			} else if (Character.isDigit(ch)) {
				num++;
			} else {
				spl++;
			}

		}

		System.out.println("Upper :" + upper);
		System.out.println("Lower :" + lower);
		System.out.println("Number :" + num);
		System.out.println("Special Character :" + spl);
	}

}
