package Suriya;

public class AcPurchase {
	public static void main(String[] args)throws PriceNotFound {
		int price=20000;
		try {
		if(price<28000) {
			throw new PriceNotFound("Hi"); 
		}
		else {
			System.out.println("product find");
			
		}
		}catch(PriceNotFound p) {
			System.out.println(p.getMessage());
		}
		
	}

}
