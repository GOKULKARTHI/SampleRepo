package org.str;

public class Demo12 {

	public static void main(String[] args) {

		String str = "Welcome";
		
		int vowels = 0, consonent = 0;
		
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;

			} else if (c >= 'a' && c <= 'z') {
				consonent++;
			}

		}

		System.out.println("Vowels Count is " + vowels);
		System.out.println("Consonent Count is " + consonent);

	}

}
