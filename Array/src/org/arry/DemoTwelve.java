package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoTwelve {
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

		list.add(2, 50);

		System.out.println(list);

		list.add(list.size(), 70);
		System.out.println(list);
		
		list.add(8, 80);
		System.out.println(list);
		
		list.add(list.lastIndexOf(10), 100);
		System.out.println(list);
	}

}
