package Day4;

public class Usecar {

	public static void main(String[] args) {
		String[] a=args[0].split(",");
		Car x=new Car();
		x.brand=a[0];
		x.price=Integer.parseInt(a[1]);
		x.color=a[2];
		
	}

}
