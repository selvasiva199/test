package Day2;

public class Usemarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.price=30;
		m1.color="Red";
		m1.brand="Camlin";
		System.out.println("PRICE=" +m1.price+" COLOR=" +m1.color+" BRAND=" +m1.brand);
		Marker m2=new Marker();
			m2.price=45;
			m2.color="blue";
			m2.brand="hero";
			System.out.println("PRICE=" +m2.price+" COLOR=" +m2.color+" BRAND=" +m2.brand);
			Marker m3=new Marker();
			m3.price=50;
			m3.color="black";
			m3.brand="raymands";
			System.out.println("PRICE=" +m3.price+" COLOR=" +m3.color+" BRAND=" +m3.brand);
			System.out.println("TOTAL="+( m1.price+ m2.price+ m3.price));
			
			
		}
		
		
		
	}


