package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {

		System.out.println("Normal Deposit - 7.5% per annum");

	}
	public static void main(String[] args) {

		AxisBank bank = new AxisBank();

		bank.Fixed();
		bank.saving();
		bank.deposit();
	}

	

	}
