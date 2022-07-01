package Suriya;

public class Gmail {
	public static void main(String[] args)throws GmailNotFoundException {
		String word="siva#gmail";
		try {
		if(word.contains("@")) {
			System.out.println("it is gmail");
		}
		else {
			throw new GmailNotFoundException();
			
		}
		}catch(GmailNotFoundException ge) {
			System.out.println("it is not gmail");
		}
		
	}

}
