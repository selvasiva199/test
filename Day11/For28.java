package Day11;

public class For28 {
	public static void main(String[] args) {
		int[] nums= {2,4,6,8};
		int cube;
		int total=0;
		for(int i=0; i<nums.length; i++) {
			cube=nums[i]*nums[i]*nums[i];
			total=total+cube;
		}
			System.out.println(total);
		

	}

}
