package org.arry;

import java.util.ArrayList;
import java.util.List;

public class DemoSix {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);

		int lastIndex = l.lastIndexOf(10);
		int index = l.indexOf(50);
		int indx = l.indexOf(90);

		System.out.println("Last Index of the Input is " + lastIndex);
		System.out.println("Index of 50 is " + index);
		System.out.println("Index of 90 is "+indx);
	}

}
