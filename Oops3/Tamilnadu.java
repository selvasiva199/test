package Oops3;

public class Tamilnadu extends CentralGov {
	public String stateCode(String b) {
		return b;
	}
	public String noPlateColor(String a) {
		if(a.equals("white black")) {
			return "private vehicle";
		}
		else if(a.equals("yellow with black")) {
			return "public transport";
		}
		else if(a.equals("green with white")) {
			return "Electric vehicle";
		}
		else {
			return "invalid";
		}
		
	}

}
