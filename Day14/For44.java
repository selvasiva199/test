package Day14;

public class For44 {
	public static void main(String[] args) {
		String palindrome="madam";
		String rev="";
		for(int i=palindrome.length()-1; i>=0; i--) {
		rev=rev+palindrome.charAt(i);
		}
			System.out.println(rev);
			if(palindrome.equals(rev)) {
				System.out.println("palindrome");
			}
		
			else {
				System.out.println("not palindrome");
			}
}
	
	}


