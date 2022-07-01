package Suriya;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		System.out.println("good morning");
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException ae) {
			System.out.println("dont follow the method");
		}
		System.out.println("Hello");
		System.out.println("Hi");
	

}
}
