package Oops1;

public class UseCar {
	public static void main(String[] args) {
	Engine e=new Engine();
	e.setBrand("nail");
	e.setPrice(20000);
	
	Engine e1=new Engine();
	e1.setBrand("shell");
	e1.setPrice(10000);
	
	Engine e2=new Engine();
	e2.setBrand("kavaski");
	e2.setPrice(15000);
	
	Car c=new Car();
	c.setBrand("audi");
	c.setPrice(100000);
	c.setEngine(e);
	
	Car c1=new Car();
	c1.setBrand("shift");
	c1.setPrice(1000000);
	c1.setEngine(e1);
	
	Car c2=new Car();
	c2.setBrand("indigo");
	c2.setPrice(3000000);
	c2.setEngine(e2);
	
	Car[] cars= {c,c1,c2};
	int max=cars[0].getEngine().getPrice();
	for(int i=0; i<cars.length; i++) {
		if(cars[i].getEngine().getPrice()>max) {
			max=cars[i].getEngine().getPrice();
		}
		
		
		
	}
	System.out.println(max);
	


	
	}

}
