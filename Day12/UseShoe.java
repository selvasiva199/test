package Day12;

public class UseShoe {

	public static void main(String[] args) {
		Shoe s1=new Shoe();
		s1.brand="addidas";
		s1.colour="red";
		s1.price=200;
		
		Shoe s2=new Shoe();
		s2.brand="reebok";
		s2.colour="blue";
		s2.price=300;
		
		Shoe s3=new Shoe();
		s3.brand="sports";
		s3.colour="black";
		s3.price=400;
		
		Shoe s4=new Shoe();
		s4.brand="nike";
		s4.colour="white";
		s4.price=350;
		Shoe s[]= {s1,s2,s3};
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].colour.charAt(s[i].colour.length()-2));
			
		}
		
		
	}

}
