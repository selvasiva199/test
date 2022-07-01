package Day2;

public class Useshirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1.price=500;
		s1.discount=50;
		s1.netPrice=s1.price-s1.discount;
		s1.brand="otto";
		s1.color="yellow";
		
		
		Shirt s2=new Shirt();
		s2.price=400;
		s2.discount=100;
		s2.netPrice=s2.price-s2.discount;
		s2.brand="raymond";
		s2.color="rose";
		
		
		Shirt s3=new Shirt();
		s3.price=300;
		s3.discount=50;
		s3.netPrice=s3.price-s3.discount;
		s3.brand="addidas";
		s3.color="white";
		System.out.println(s1.netPrice+","+s2.netPrice+","+s3.netPrice);
	}

}
