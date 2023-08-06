package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoTwo {

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

		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		List<Integer>list1 = new ArrayList<Integer>();
		list1.add(105);
		list1.add(205);
		list1.add(305);
		list1.add(405);
		list1.add(505);
		list1.add(605);
		list1.add(705);
		list1.add(805);
		list1.add(505);
		list1.add(605);
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		set1.addAll(list1);
		System.out.println(set1);
		
		List<Integer>list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		list2.add(700);
		list2.add(100);
		list2.add(300);
		list2.add(500);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.addAll(list2);
		System.out.println(set2);
		
		
	}

}
