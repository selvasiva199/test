package Suriya;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
	String a="hi";
	
	try {
	int b=Integer.parseInt(a);
	
	System.out.println(b);
	}catch(NumberFormatException nf) {
		System.out.println("dont use string to int");
	}
	System.out.println("Hello");

}
}
