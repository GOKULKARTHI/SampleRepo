package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoFifteen {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(90);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(80);
		
		

		list1.removeAll(list2);
		System.out.println(list1);
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(10);
		list4.add(20);
		list4.add(30);
		list4.add(90);
		list4.add(10);
		list4.add(10);
		list4.add(40);
		list4.add(50);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list3.add(60);
		list3.add(50);
		list3.add(40);
		list3.add(70);
		list3.add(80);
		list3.add(90);
		
		list4.removeAll(list3);
		System.out.println(list4);

	}

}
