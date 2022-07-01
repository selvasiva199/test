
public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="swift";
		car1.price=20000;
		
		Car car2=new Car();
		car2.brand="innova";
		car2.price=30000;
		
		Car car3=new Car();
		car3.brand="honda";
		car3.price=40000;
		
		if (car1.price>car2.price&&car1.price>car3.price) {
			System.out.println(car1.brand);
		}
		else if (car2.price>car3.price&&car2.price>car1.price) {
			System.out.println(car2.brand);
			
		}
		else if (car3.price>car2.price&&car3.price>car1.price) {
			System.out.println(car3.brand);
		}
		
		
		
				
		
	

	
		
	}

}
