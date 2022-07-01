package Day16;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="lenova";
		l1.price=170000;
		l1.color="red";
		
		
		Laptop l2=new Laptop();
		l2.brand="hp";
		l2.price=70000;
		l2.color="white";
		
		Laptop l3=new Laptop();
		l3.brand="dell";
		l3.price=45000;
		l3.color="black";
		
		Laptop[] laptops= {l1,l2,l3};
		
		for(int i=0; i<laptops.length; i++) {
			if(laptops[i].price>50000) {
				laptops[i].discount=5000;
				laptops[i].taxAmount=7000;
				laptops[i].netPrice=laptops[i].price+laptops[i].taxAmount-laptops[i].discount;
			}
			else {
				
				laptops[i].discount=1000;
				laptops[i].taxAmount=5000;
				laptops[i].netPrice=laptops[i].price+laptops[i].taxAmount-laptops[i].discount;
			
		}
		
		System.out.println(laptops[i].brand+laptops[i].color+laptops[i].netPrice);
				
				
			}
			
		}
		
		

	
	}


