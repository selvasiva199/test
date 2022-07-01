package Suriya;

public class FinallyExample {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException ae) {
			System.out.println("dont");
		}finally {
		System.out.println("hello");
		}
		System.out.println("hii");
	}

}
