package Suriya;

public class FindAge {
	public static void main(String[] args)throws AgeException {
		int age=16;
		try {
		if(age<18) {
			throw new AgeException("age is invalid");
		}else {
			System.out.println("Eligible");
		}
		}catch(AgeException ae) {
		System.out.println(ae.getMessage());
		}
		
		System.out.println("final");
		
	}

	

}
