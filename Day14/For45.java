package Day14;

public class For45 {
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,60,70};
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]%20==0) {
				
			
				System.out.println(numbers[i]+"divicible");
			}
			else {
				System.out.println(numbers[i]+"not divicible");
			}
		}
	

	
	}

}
