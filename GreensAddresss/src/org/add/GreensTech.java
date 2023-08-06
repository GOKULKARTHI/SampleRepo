package org.add;

public class GreensTech {

	public void greensOmr() {

		System.out.println("Green Tech in Omr");
	}

	public void greensOmr(String location) {

		System.out.println(location);
	}

	public void greenOmr(String streetName, long ph) {

		System.out.println(streetName);
		System.out.println(ph);

	}

	public void greenOmr(long pinCode, String email) {

		System.out.println(pinCode);
		System.out.println(email);

	}

	public static void main(String[] args) {

		GreensTech tech = new GreensTech();

		tech.greensOmr();
		tech.greensOmr("Perumbakkam");
		tech.greenOmr("Perumbakkam Street", 9488067032L);
		tech.greenOmr(638009L, "greenstech@gmail.com");

	}

}
