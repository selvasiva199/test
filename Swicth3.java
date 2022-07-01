
public class Swicth3 {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		String calculator="add";
		switch(calculator) {
		case"add":System.out.println(a+b);
		break;
		case"substractoin":System.out.println(a-b);
		break;
		case"multiplecatoin":System.out.println(a*b);
		break;
		case"divide":System.out.println(a/b);
		break;
		default:System.out.println("invalid");
		}
	}

}
