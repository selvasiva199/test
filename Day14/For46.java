package Day14;

public class For46 {
	public static void main(String[] args) {
		int[] numbers= {10,90,50,110,215,16,3};
		int max=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}
			
		}
		System.out.println(max);

	
	}

}
