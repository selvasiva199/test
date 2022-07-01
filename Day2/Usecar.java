package Day2;

public class Usecar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Indigo";
		c1.color="white";
		c1.price=100000;
		c1.discount=7;
		c1.taxAmount=20;
		c1.netPrice=(c1.price-(c1.price*c1.discount/100)+(c1.price*c1.taxAmount/100));
		
		System.out.println("netprice="+c1.netPrice);
		Car c2=new Car();
		c2.brand="swift";
		c2.color="sandle";
		c2.price=1000000;
		c2.discount=8;
		c2.taxAmount=10;
		System.out.println(c2.price-(c2.price))
		
		
	}

}
