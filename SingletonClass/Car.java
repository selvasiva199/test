package SingletonClass;

public class Car {
	int price;
	String model;
	private static Car c=null;
	private Car(int price,String model) {
		this.price=price;
		this.model=model;
		
	}
	public static Car createObj() {
		if(c==null) {
			c= new Car(10000,"inventory");
			
		
		}
		return c;
	}
	public String toString() {
		return price+" "+model;
	}

}
