package Day2;

public class Usebike {
	public static void main(String[] args){
		Bike b1=new Bike();
		b1.price=70000;
		b1.color="Black";
		b1.brand="hero";
		
		
		Bike b2=new Bike();
//		b2.price=65000;
//		b2.color="blue";
//		b2.brand="suzuki";
		
		
		Bike b3=new Bike();
//		b3.price=65000;
//		b3.color="blue";
//		b3.brand="suzuki";
		if(b2==b3) {
			System.out.println("b2 and b3 is same");
		}else {
			System.out.println("b2 and b3 is different");
			
		}
		if(b2.equals(b3)) {
			System.out.println("b2 and b3 is same");
		}else {
			System.out.println("b2 and b3 is different");
			
			if(b2.   equals(b3)) {
				System.out.println("b2 and b3 is same");
			}else {
				System.out.println("b2 and b3 is different");
				
				
			
		}
//		System.out.println("PRICE=" +b1.price+" COLOR=" +b1.color+" BRAND=" +b1.brand);
//		System.out.println("PRICE=" +b2.price+" COLOR=" +b2.color+" BRAND=" +b2.brand);
//		System.out.println("PRICE=" +b3.price+" COLOR=" +b3.color+" BRAND=" +b3.brand);
//		System.out.println("the total of bike price=" +(b1.price+b2.price+b3.price));
		
	}

		
		
		
	}
	


