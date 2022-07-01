package Suriya;

public class CustomExceptionExample {
	
	public static void main(String[] args)throws AgeExceptionEx {
		int age=17;
		try {
		if(age>=18) {
			System.out.println("eligible");
			
		}
		else {
			throw new AgeExceptionEx("Age less");
		}
		
		}catch(AgeExceptionEx ae) {
			System.out.println("age is less 18");
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		System.out.println("Hello");
	}

}

