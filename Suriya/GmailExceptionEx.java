package Suriya;

public class GmailExceptionEx {
	public static void main(String[] args) {
		String word="siva&karthi*dinesh$%";
		try {
		if(word.contains("@")) {
			System.out.println("it is gmail");
		}
		
		}catch(StringIndexOutOfBoundsException ae) {
			System.out.println("it is not gmail");
		}
		
			
		
	}

}
