package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoEight {

	public static void main(String[] args) {
//6.1
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		Integer value = list.get(2);
		System.out.println(value);
//6.2
		List<Integer> li = new ArrayList<>();

		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);

		Integer val = li.get(4);
		System.out.println(val);

		// 6.3
		List<Integer> lit = new ArrayList<Integer>();
		lit.add(105);
		lit.add(205);
		lit.add(305);
		lit.add(405);
		lit.add(505);
		lit.add(605);
		lit.add(705);
		lit.add(805);
		lit.add(905);
		Integer valu = lit.get(8);
		System.out.println(valu);
		
		
		

	}

}
