package Oops3;

public class television implements Smarttelevision {
	String brand;
	int price;
	public String getNetPrice(int price, int deliveryCharge) {
		int netprice=price+deliveryCharge;
		if(netprice>50000) {
			return "heavy";
		}
		else {
			return "below 50000";
		}
	}
	@Override
	public String wifiAccess(String access) {
		// TODO Auto-generated method stub
		return "Access";
	}
	@Override
	public String autoCooling(String cool) {
		// TODO Auto-generated method stub
		return "Cool";
	}

}
