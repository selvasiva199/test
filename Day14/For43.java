package Day14;

public class For43 {
	public static void main(String[] args) {
		String program1="java";
		int count=0;
		int count1=0;
		for(int i=0; i<program1.length(); i++) {
			char var=program1.charAt(i);
			if(var=='a'||var=='e'||var=='i'||var=='o'||var=='u') {
				
			
				System.out.println(var+"is vowels");
				count=count+1;
			
				
			
			}
			
			else {
				System.out.println(var+"not vowels");
				count1=count+1;
			}
				System.out.println(count+"no of vowels");
				System.out.println(count1+"not vowels");
				
			
			
		}

	
	}

}
