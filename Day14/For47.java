package Day14;

public class For47 {
	public static void main(String[] args) {
		int[] numbers= {10,90,50,110,215,16,3};
		int min=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(min>numbers[i]) {
				min=numbers[i];
			}
		}
		System.out.println(min);
	}

}
