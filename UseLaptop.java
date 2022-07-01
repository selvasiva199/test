
public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="idell";
		
		Laptop l2=new Laptop();
		l2.brand="lenova";
		
		Laptop l3=new Laptop();
		l3.brand="idall";
		
		if (l1.brand.charAt(0)==l3.brand.charAt(0)) {
			System.out.println("both are start with same letters");
		}
		else {
			System.out.println("invalid");
		}

	
	}

}
