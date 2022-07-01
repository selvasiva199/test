package Day16;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.brand="raymond";
		
		m1.colour="red";
		m1.price=30;
		
		Marker m2=new Marker();
		m2.brand="ohh";
		m2.colour="blue";
		m2.price=20;
		
		Marker m3=new Marker();
		m3.brand="renaults";
		m3.colour="black";
		m3.price=10;
		
		Marker[] markers= {m1,m2,m3};
		int maxPrice=markers[0].price;
		int minPrice=markers[0].price;
		for(int i=0; i<markers.length; i++) {
			if(maxPrice<markers[i].price) {
				maxPrice=markers[i].price;
			}
			
		}
		System.out.println("this is "+maxPrice);
		
		
		for(int i=0; i<markers.length; i++) {
			if(minPrice>markers[i].price) {
				minPrice=markers[i].price;
			}
		}
		System.out.println("this is "+minPrice);
		
		
		
		
		
		
		
		
	}

		
		
		

	}


