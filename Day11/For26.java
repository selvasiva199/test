package Day11;

public class For26 {
	public static void main(String[] args) {
		int[] nums= {2,8,15,27,32};
		int total=0;
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		int fibo=0;
		for(int i=0; i<=total; i++) {
			fibo+=i;
			
		}
		System.out.println(fibo);


	}

}
