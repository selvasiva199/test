package Oops1;

public class Mobile {
	private String brand;
	private int price;
	private Battory battory;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBattory(Battory battory) {
		this.battory=battory;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Battory getBattory() {
		return battory;
	}
	public Mobile(String brand,int price,Battory battory) {
		this.brand=brand;
		this.price=price;
		this.battory=battory;
	}
	public String toString( ) {
		return "Brand="+brand+"Price="+price+"Battory="+battory;
	}
	}
	


