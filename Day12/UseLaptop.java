package Day12;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="hp";
		l1.colour="black";
		l1.price=1000;
		
		Laptop l2=new Laptop();
		l2.brand="dell";
		l2.colour="red";
		l2.price=1200;
		
		Laptop l3=new Laptop();
		l3.brand="lenova";
		l3.colour="white";
		l3.price=1300;
		 
		Laptop l4=new Laptop();
		l4.brand="cell";
		l4.colour="blue";
		l4.price=1500;
		
		Laptop l5=new Laptop();
		l5.brand="hell";
		l5.colour="rose";
		l5.price=16000;
		
		Laptop l6=new Laptop();
		l6.brand="asus";
		l6.colour="ash";
		l6.price=1800;
		//int add=0;
	
		Laptop[] a= {l1,l2,l3,l4,l5,l6};
		int count=0;
		int fact= 1;
		for(int i=a.length/2; i<a.length; i++) {
		//	add=add+a[i].price;
			count=count+a[i].price;
			fact=fact*a[i].price;
		}
			//System.out.println(a[i]);
			
		//	System.out.println(a[i].brand.toUpperCase());
			//System.out.println(a[i].colour.toLowerCase());
		//}
			//System.out.println(add);
			System.out.println(fact);
			System.out.println(count);
		
		}

	
	

}
