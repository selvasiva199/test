package Day12;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Innova";
		c1.colour="Red";
		c1.price=120000;
		
		Car c2=new Car();
		c2.brand="BMW";
		c2.colour="ash";
		c2.price=15000000;
		
		Car c3=new Car();
		c3.brand="nano";
		c3.colour="Black";
		c3.price=100000;
		
		Car[] car= {c1,c2,c3};
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i].brand);
		}
		
	}

}
