package Oops3;

public class UseAtms {
	public static void main(String[] args) {
		Credit c=new Credit();
		Debit d=new Debit();
		System.out.println(c.AccountBalance(80000,20000));
		System.out.println(d.AccountBalance(42000,12000));
	}

}
