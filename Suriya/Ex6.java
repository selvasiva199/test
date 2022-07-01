package Suriya;

public class Ex6 {
	public static void main(String[] args) {
		try {
		int a=15;
		int b=0;
		int c=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Allways print");
		}
		System.out.println("final");
		
	}


}
