package org.Comp;

public class Desktop extends Computer {

	public void desktopSize() {
		
		System.out.println("Desktop Size ; ");
		System.out.println("1. Large Size");
		System.out.println("2. Medium Size");
		System.out.println("3. Small Size");
		
	
	}
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
	
}
