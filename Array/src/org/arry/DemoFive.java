package org.arry;

import java.util.ArrayList;

public class DemoFive {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		int[] li = { 10,20,30,90 };

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);

		int index = list.indexOf(10);
		System.out.println(index);

	}

}
