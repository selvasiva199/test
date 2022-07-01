
public class Home {
	public static void main(String[] args) {
		String wifiname=args[0];
		String wifipassword=args[1];
		if(wifiname.equals(wifipassword) ) {
			System.out.println("NOT CONNECTED");
		}
		else {
			System.out.println("CONNECTED");
		}
	}

	public Home() {
		// TODO Auto-generated constructor stub
	}

}
