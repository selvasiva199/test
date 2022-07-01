package Oops3;

public class Usetelevision {
	public static void main(String[] args) {
		television t1=new television();
		t1.brand="onida";
		t1.price=3000;
		int deliveryCharge=1000;
		String wifiAccess="available";
		String autoCooling="unavailable";
		System.out.println("brand="+t1.brand+","+"price="+t1.price+","+"netprice method="+t1.getNetPrice(t1.price, deliveryCharge)+","+"wifi="+wifiAccess+","+"Autocool="+autoCooling);
		
		

		
	}

}
