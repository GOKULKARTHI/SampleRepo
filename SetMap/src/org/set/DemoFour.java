package org.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoFour {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20);
		;
		Set<Integer> list1 = new TreeSet<>(list);
		for (Integer value : list1) {
			System.out.println(value);
		}
		System.out.println("\n HashSet value");
		Set<Integer> list2 = new HashSet<>(list);
		for (Integer value1 : list2) {

			System.out.println(value1);
		}
	}

}
