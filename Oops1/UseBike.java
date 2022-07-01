package Oops1;

public class UseBike {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.setBrand("shell");
		e.setPrice(1000);
		
		Bike b=new Bike();
		b.setBrand("pulser");
		b.setPrice(100000);
		b.setEngine(e);
		System.out.println();
		
	

	
	}

}
