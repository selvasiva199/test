package Oops3;

public class Vivo implements SmartPhone {
	public void camarafuntion(String a) {
		switch(a) {
		case "singleTap":System.out.println("taking picture");
		break;
		case "doubleTap":System.out.println("front camara");
		break;
		case "continuesTap":System.out.println("continues shot");
		break;
		default:System.out.println("invalid");
		
		}
	}

	
}
