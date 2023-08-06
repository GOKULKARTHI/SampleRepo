package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoFourteen {

	public static void main(String[] args) {
		// Create the first list
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(90);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		list1.add(50);

		// Create the second list
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(60);
		list2.add(50);
		list2.add(40);
		list2.add(70);
		list2.add(80);
		list2.add(90);

		// Create the new list to store the common values
		List<Integer> commonValues = new ArrayList<>();

		// Find the common values and add them to the new list
		for (int value : list1) {
			if (list2.contains(value)) {
				commonValues.add(value);
			}
		}

		// Print the common values
		System.out.println(commonValues);
	}
}
