package org.univ;

public class College extends University {

	public void ug() {

		System.out.println("Under Graduate");

	}

	public void pg() {

		System.out.println("Post Graduate");
	}

	public static void main(String[] args) {

		College c = new College();
		c.ug();
		c.pg();
	}
}
