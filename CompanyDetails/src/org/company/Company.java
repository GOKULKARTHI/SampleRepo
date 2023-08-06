package org.company;

import org.client.Client;

public class Company extends Client {

	public void companyName() {

		System.out.println("Comapany Name -  Quest Global Infotech Ltd");

	}

	public static void main(String[] args) {
		Company info = new Company();
		info.companyName();
		info.clientName();
	}

}
