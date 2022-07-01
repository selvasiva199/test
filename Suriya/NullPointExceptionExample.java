package Suriya;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		String a=null;
		int b=0;
		try {
			b=a.length();
		}catch(NullPointerException np) {
			System.out.println("please dont use String null");
			
		}
		System.out.println(b);
		System.out.println("Hello");
		
	}

}
