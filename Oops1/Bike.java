package Oops1;

public class Bike {
	private String brand;
	private int price;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Engine getEngine() {
		return engine;
	}
	public Bike(String brand,int price,Engine engine) {
		this.brand=brand;
		this.price=price;
		this.engine=engine;
	}
	public String toString() {
		return "Brand="+brand+"Price="+price+"Engine="+engine;
		
		
		
	}

		

	
	}


