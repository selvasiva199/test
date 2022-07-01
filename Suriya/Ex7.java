package Suriya;

public class Ex7 {
	public static void main(String[] args) {
		try {
		String a="Suriya";
		System.out.println(a.charAt(7));
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
		}catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}catch(NullPointerException ne) {
			ne.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("muthu");
		}
		finally {
			System.out.println("ok");
		}
	}

	

}
