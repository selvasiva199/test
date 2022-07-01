package Day14;

public class For411 {
	public static void main(String[] args) {
		String words="Hello";
		int count=0;
		
		for(int i=0; i<words.length(); i++) {
			char var=words.charAt(i);
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
				count= count+1;
			
			
			System.out.println(var+"is vowels");
		}
		else {
			System.out.println(var+"not vowels");
		}
		}
	}
}


