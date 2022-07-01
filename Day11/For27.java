package Day11;

public class For27 {
	public static void main(String[] args) {
		int[] nums= {2,8,15,27,32};
		int square;
		int total=0;
		for(int i=0; i<nums.length; i++) {
			square=nums[i]*nums[i];
			total=total+square;
			
		}
		System.out.println(total);
		

	
	}

}
