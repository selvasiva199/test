package Suriya;

public class IndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int[] e= {a,b,c,d};
		try {
		System.out.println(e[5]);
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("out of array length");
		}
		String word="onesoft";
		try {
		System.out.println(word.charAt(8));
		}catch(StringIndexOutOfBoundsException si) {
			System.out.println("out of String length");
		}
		
	}

}
