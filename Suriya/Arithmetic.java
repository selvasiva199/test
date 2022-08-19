package Suriya;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("hi");
		int a=10;
		int b=0;
		//int c=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException ae) {
			System.out.println("dont divide user defind");
			System.out.println(ae);
		ae.printStackTrace();
		}
		finally {
			
		
		
		System.out.println("hello");
	}

}
}
