package Oops2;

public class bank {
	public int loanEligibility() {
		return 30000;
	}
	public int loanEligibility(int salary) {
		return 10*salary+30000;
	}
	public int loanEligibility(int salary,int assat) {
		return 10*salary+30000+(assat/5);
	}
	public static void main(String[] args) {
		bank b=new bank();
		System.out.println(b.loanEligibility());
		System.out.println(b.loanEligibility(30000));
		System.out.println(b.loanEligibility(30000,500000));

	
	}

}
