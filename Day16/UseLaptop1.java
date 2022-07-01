package Day16;

public class UseLaptop1 {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="lenova";
		l1.price=179000;
		l1.color="white";
		
		Laptop l2=new Laptop();
		l2.brand="asus";
		l2.price=75000;
		l2.color="white";
		
		Laptop[] laptops= {l1,l2};
		for(int i=0; i<laptops.length; i++) {
			if(laptops[i].price>100000) {
				laptops[i].discount=laptops[i].price*5/100;
				laptops[i].taxAmount=laptops[i].price*10/100;
				laptops[i].netPrice=(laptops[i].price+laptops[i].taxAmount)-laptops[i].discount;
			}
			
		}
		System.out.println(laptops[i].netPrice);
		
		

	
	}

}
