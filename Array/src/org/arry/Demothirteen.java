package org.arry;

import java.util.ArrayList;
import java.util.List;

public class Demothirteen {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);

		list.add(2, 350);
		list.remove(3);
		System.out.println(list);

		List<Integer> lit = new ArrayList<Integer>();
		lit.add(10);
		lit.add(20);
		lit.add(30);
		lit.add(90);
		lit.add(10);
		lit.add(10);
		lit.add(40);
		lit.add(50);
		lit.add(10);

		lit.remove(7);
		lit.add(7, 90);
		System.out.println(lit);

		List<Integer> lits = new ArrayList<Integer>();
		lits.add(10);
		lits.add(20);
		lits.add(30);
		lits.add(90);
		lits.add(10);
		lits.add(10);
		lits.add(40);
		lits.add(50);
		lits.add(30);

		for (int i = 0; i < lits.size(); i++) {
			if (lits.get(i) == 10) {
				lits.set(i, 100);

			}

		}

		System.out.println(lits);

		List<Integer> lists = new ArrayList<Integer>();

		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.add(90);
		lists.add(10);
		lists.add(10);
		lists.add(40);
		lists.add(50);
		ArrayList<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i) == 30 || lists.get(i) == 40 || lists.get(i) == 50 || lists.get(i) == 60
					|| lists.get(i) == 80) {
				Integer y = lists.get(i);
				boolean q = l.add(y);
			}

		}
		System.out.println(l);

		ArrayList<Integer> g = new ArrayList<Integer>();

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i) == 10 || lists.get(i) == 20 || lists.get(i) == 60 || lists.get(i) == 50
					|| lists.get(i) == 40 || lists.get(i) == 70 || lists.get(i) == 80 || lists.get(i) == 90) {
				Integer x = lists.get(i);
				boolean r = g.add(x);
			}

		}
		System.out.println(g);

	}

}
