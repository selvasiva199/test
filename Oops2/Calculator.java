package Oops2;

public class Calculator extends Abacus {
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static void main(String args[]) {
		Calculator c=new Calculator();
		System.out.println(c.add(5, 4));
		System.out.println(c.sub(6, 3));
		System.out.println(c.mul(2, 4));
		System.out.println(c.div(3, 9));
		
	


	}

}
