
public class UseBag {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.brand="buma";
		b1.price=200;
		b1.color="black";
		
		
		Bag b2=new Bag();
		b2.brand="nike";
		b2.price=300;
		b2.color="black";
		
		if (b1.color.equals(b2.color)) {
			System.out.println("this is same color");
	}
		else {
			System.out.println("not same color");
		}
	}

}
