package org.arry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class DemoFour {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		LinkedList<Integer> l = new LinkedList<>();
		Vector<Integer> lists = new Vector<>();
		int[] li = { 10, 20, 30, 90, 10, 10, 40, 50 };
		

		for (int i = 0; i < li.length; i++) {
			list.add(i);
		}
		System.out.println("Length of the ArrayList is " + list.size());

		int[] lit = { 100, 200, 300, 400, 500, 600, 700 };
		for (int i = 0; i < lit.length; i++) {
			l.add(i);
		}
		System.out.println("Length of the LinkedList is " + l.size());

		int[] lits = { 105, 205, 305, 405, 505, 605, 705, 805 };
		for (int i = 0; i < lits.length; i++) {
			lists.add(i);
		}
		System.out.println("Length of the Vector is " + lists.size());
	}

}
