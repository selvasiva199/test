package Day18;

public class Calculation {

	public void findOdd(int a) {
		if(a%2==0) {
			System.out.println(a+"is even");
		}
		else {
			System.out.println(a+"is odd");
		}
		}
	public void findIndexOddEven(int num) {
		Calculation c=new Calculation();
		for(int i=0; i<=num; i++) {
			c.findOdd(i);
		}
	}
	}


