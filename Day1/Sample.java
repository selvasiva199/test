package Day1;

public class Sample {
	public static void main(String[] args) {
		String name="tyj577mjh676";
		char[] c=name.toCharArray();
		int count=0;
		int count1=0;
		for(int i=0; i<c.length; i++) {
			if(c[i]>'a' && c[i]<='z') {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println("alphabets " +count+"\n"+"integers " +count1);
	
	
		
			
		}
}
		
		

	


