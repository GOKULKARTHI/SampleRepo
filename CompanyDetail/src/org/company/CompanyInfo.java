package org.company;

public class CompanyInfo {

	public void companyName() {

		System.out.println("Company Namr - Quest Global Ltd");

	}

	public void companyName(String Location) {

		System.out.println("Company location - " + Location);
	}

	public void companyName(Long phoneno, int pinCode) {
		System.out.println("Company Phone Number - "+phoneno);
		
		System.out.println("Company Pincode - "+pinCode);

	}
	public static void main(String[] args) {
		
		CompanyInfo info = new CompanyInfo();
		info.companyName();
		info.companyName("Oragadam");
		info.companyName(9488067032L, 638009);
	
		Gokul karthick
	}
}
