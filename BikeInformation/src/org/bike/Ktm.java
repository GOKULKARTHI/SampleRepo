package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {

		System.out.println("Cost of Bike - " + cost);
	}

	@Override
	public void speed() {

		System.out.println("Maximum Speed of Ktm Bike - " + speed);

	}

	public static void main(String[] args) {

		Ktm bike = new Ktm();

		bike.cost();

		bike.speed();
	}

}
