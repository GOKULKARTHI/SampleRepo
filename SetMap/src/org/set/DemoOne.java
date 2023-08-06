package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoOne {

	public static void main(String[] args) {

		HashSet<Integer> list = new HashSet<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(10);
		list.add(20);

		System.out.println(list);

		LinkedHashSet<Integer> list1 = new LinkedHashSet<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.add(10);
		list1.add(20);
		
		System.out.println(list1);
		
		TreeSet<Integer> list2 = new TreeSet<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(10);
		list2.add(20);
		
		System.out.println(list2);
		

	}

}
