package org.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoFive {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60, 80));

		Set<Integer> value = new HashSet<>();
		for (Integer in : set1) {
			if (set2.contains(in)) {
				value.add(in);
			}
		}
		System.out.println(value);
		// 4.2
		Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 90, 10, 10, 40, 50));
		Set<Integer> set4 = new LinkedHashSet<>(Arrays.asList(10, 20, 60, 50, 40, 70, 80, 90));

		Set<Integer> commonValue = new LinkedHashSet<>();
		for (Integer cm : set3) {
			if (set4.contains(cm)) {
				commonValue.add(cm);
			}
		}
		System.out.println(commonValue);
		// 4.3
		Set<Integer> set5 = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
		Set<Integer> set6 = new TreeSet<>(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 8000));

		Set<Integer> cmValue = new TreeSet<>();
		for (Integer integer : set5) {
			if (set6.contains(integer)) {
				cmValue.add(integer);
			}
		}
		System.out.println(cmValue);

		// 5.1
		set1.removeAll(set2);
		System.out.println(set1);
		// 5.2
		set3.removeAll(set4);
		System.out.println(set3);
		// 5.3
		set5.removeAll(set6);
		System.out.println(set5);

	}

}
