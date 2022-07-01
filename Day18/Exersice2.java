package Day18;

public class Exersice2 {
	public String findOddEven(int num) {
		if (num % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}

	}
	public String findLargNum(int num1,int num2) {
		if(num1<num2) {
			return num2+"is larger";
			
		}
		else {
			return num1+"is larger";
		}
	}
	public void findSquare(int num) {
	int	a=num*num;
	int	b=a+2;
		System.out.println(b);
		
			
		}
	
	}


