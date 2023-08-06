package org.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoThree {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(105, 205, 305, 405, 505, 605, 705, 805);
		Set<Integer> list = new HashSet<>(a);
		for (int values : list) {
			System.out.println(values);
		}

	}

}
