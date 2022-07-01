package Oops2;

public class Bike extends Cycle  {
	
	
	
	public String speed(int a) {
		if(a<=60) {
			return "high speed";
			
		}
		else {
			return "low speed";
		}
	}
		public static void main(String args[]) {
			Bike b=new Bike();
			b.drive();
			System.out.println(b.CycleName("herculas"));
			System.out.println(b.speed(40));
		
	
		

	
	}

}
