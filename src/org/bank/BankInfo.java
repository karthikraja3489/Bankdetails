package org.bank;

public class BankInfo extends AxisBank {
public void saving() {
	System.out.println("Savings Bank Account");
}
public void fixed() {
	System.out.println("Fixed Deposit");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankInfo b=new BankInfo();
b.deposit();
b.saving();
b.fixed();

	}

}
