package Day11;

public class For2Test3 {
	public static void main(String[] args) {
		int[] num= {143,176,77,99,89,40,99,41,77,79,33};
		int total=0;
		int count=0;
		for(int i=0; i<num.length; i=i+2) {
			total=total+num[i];
			count=count+1;
		}
			System.out.println(total/count);
			System.out.println(total); 
		
		

	
	}

}
