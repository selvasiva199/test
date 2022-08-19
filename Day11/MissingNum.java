package Day11;

//import java.util.Arrays;

public class MissingNum {

public static void main(String[] args) {
	int[] num= {1,2,3,5,6};
	int count=0;
	int count1=0;
	for(int i=0;i<num.length; i++) {
		count=count+num[i];
		
	}
	for(int j=1; j<=6; j++) {
		count1=count1+j;
		

	}
	System.out.println(count1-count);

}
}
