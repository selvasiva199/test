package Day12;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1.brand="otto";
		s1.colour="red";
		s1.price=1000;
		
		Shirt s2=new Shirt();
		s2.brand="finix";
		s2.colour="blue";
		s2.price=2000;
		
		Shirt s3=new Shirt();
		s3.brand="ballmain";
		s3.colour="white";
		s3.price=3000;
		
		Shirt s4=new Shirt();
		s4.brand="anand";
		s4.colour="yellow";
		s4.price=4000;
		
		Shirt s5=new Shirt();
		s5.brand="ramraj";
		s5.colour="black";
		s5.price=5000;
		
		Shirt s6=new Shirt();
		s6.brand="do";
		s6.colour="rose";
		s6.price=6000;
		
		Shirt s7=new Shirt();
		s7.brand="while";
		s7.colour="brown";
		s7.price=7000;
		
		Shirt s8=new Shirt();
		s8.brand="meant";
		s8.colour="vilot";
		s8.price=500;
		
		Shirt[] a= {s1,s2,s3,s4,s5,s6,s7,s8};
		for(int i=0; i<a.length; i++) {
		
		
		System.out.println(a[i].brand.length());
		System.out.println(a[i].brand.toUpperCase());
		System.out.println(a[i].brand.toLowerCase());
		System.out.println(a[i].brand.equals("s1.brand"));
		System.out.println(a[i].brand.charAt(a[i].brand.length()-1));
		
		
		}
		}
		
		
	}


