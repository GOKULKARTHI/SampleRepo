package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {

		System.out.println("Deposit Available are");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();

		bank.deposit();
		bank.saving();
		bank.fixed();

	}
}
