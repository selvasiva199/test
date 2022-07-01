package Oops3;

public class Credit implements ATM {
	public String AccountBalance(int mainBalance,int amount) {
		if(amount<=25000) {
			return "mainBalance="+(mainBalance+amount);
		}
		else {
			return "can't credit above 25000";
		}
	}
}
