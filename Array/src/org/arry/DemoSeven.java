package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoSeven {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(10);

		List<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 10|| list.get(i)==70) {
				index.add(i);

			}

		}
		System.out.println(index);
	}

}
