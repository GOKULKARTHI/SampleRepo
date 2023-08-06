package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoNine {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(105);
		list.add(205);
		list.add(305);
		list.add(405);
		list.add(505);
		list.add(605);
		list.add(705);
		list.add(805);

		System.out.println("Normal for loop");

		for (int i = 0; i < list.size(); i++) {

			Integer value = list.get(i);
			System.out.println(value);
		}

		System.out.println("\nEnchanced For Loop");

		for (Integer in : list) {

			Integer enchanced = in.valueOf(in);
			System.out.println(enchanced);

		}

	}

}