
public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.brand="appachi";
		b1.price=50000;
		b1.color="black";
	
	Bike b2=new Bike();
	b2.brand="ero";
	b2.price=60000;
	b2.color="white";
	
	Bike b3=new Bike();
	b3.brand="rayalenfield";
	b3.price=70000;
	b3.color="blue";
	
	if (b1.brand.startsWith("r")) {
		System.out.println(b1.brand);
	}
	else if (b2.brand.startsWith("r")) {
		System.out.println(b2.brand);
	}
	else if (b3.brand.startsWith("r") ) {
		System.out.println(b3.brand);
	}
	

}
}
