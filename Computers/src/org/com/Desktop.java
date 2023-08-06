package org.com;

public class Desktop implements Software {

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resource - CPU");

	}

	@Override
	public void softwareResources() {

		System.out.println("Software Resource - Windows Operating System");

	}

	public void desktopModel() {

		System.out.println("Desktop Model - Super");

	}

	public static void main(String[] args) {

		Desktop top = new Desktop();

		top.desktopModel();
		top.hardwareResources();
		top.softwareResources();
	}

}
