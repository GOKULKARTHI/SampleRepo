package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoEleven {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(10);
		list.add(10);
		list.add(40);

		list.remove(list.lastIndexOf(10));

		System.out.println(list);

	}

}
