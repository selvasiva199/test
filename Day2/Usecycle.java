package Day2;

public class Usecycle {
	public static void main(String[] args) {
		Cycle c1=new Cycle();
		c1.brand="innova";
		c1.color="blue";
		c1.tax=20;
		c1.discount=15;
		c1.price=100000;
		c1.netPrice=(c1.price-(c1.price*c1.discount/100)+(c1.price*c1.tax/100));
		System.out.println("netPrice="+c1.netPrice);
		
		
		Cycle c2=new Cycle();
		c2.brand="swift";
		c2.color="red";
		c2.tax=10;
		c2.discount=5;
		c2.price=1000000;
		c2.netPrice=(c2.price-(c2.price*c2.discount/100)+(c2.price*c2.tax/100));
		System.out.println("netPrice="+c2.netPrice);
	}
}
		
		
