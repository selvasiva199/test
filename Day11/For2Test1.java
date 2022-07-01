package Day11;

public class For2Test1 {
	public static void main(String[] args) {
	String[] name= {"java","sundhar","velu","javascrit","mysql"};	
	
		
	
		for(int i=name.length-1; i>=0; i--) {
			System.out.println(name[i].charAt(name[i].length()-2));
		}

	}

}
