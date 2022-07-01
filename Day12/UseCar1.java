package Day12;

public class UseCar1 {

	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.brand="innova";
		c1.colour="red";
		c1.price=120000;
		
		Car1 c2=new Car1();
		c2.brand="bmw";
		c2.colour="ash";
		c2.price=150000;
		
		Car1 c3=new Car1();
		c3.brand="nano";
		c3.colour="black";
		c3.price=100000;
		
		Car1[] car= {c1,c2,c3};
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i].colour);
			System.out.println(car[i].price+1000);
		}
	}

}
