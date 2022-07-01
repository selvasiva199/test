package Oops3;

public class Debit implements ATM {
	public String AccountBalance(int mainBalance,int amount) {
		if(amount<mainBalance) {
			return "mainBalance="+(mainBalance-amount);
		}
		else {
			return "you can't debit out of range";
		}
	}

}
