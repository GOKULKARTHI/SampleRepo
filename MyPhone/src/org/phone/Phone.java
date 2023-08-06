package org.phone;

public class Phone {

	public void phoneInfo() {

		System.out.println("Emergency Hospital Number");

	}

	public void phoneInfo(String name, long ph) {
		System.out.println("1." + name + "," + ph);

	}

	public void phonrInfo(long pinCode, String drName) {
		System.out.println("2." + pinCode + "," + drName);
	}
	public static void main(String[] args) {
		
		Phone num = new Phone();
		num.phoneInfo();
		num.phoneInfo("Gokul", 9488067032L);
		num.phonrInfo(638009L, "Dr.Gokul");
		
	}

}
