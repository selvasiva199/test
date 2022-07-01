package Suriya;

public class MultyCatchesBlockExample {
	public static void main(String[] args) {
		try {
		String a="120";
		String b="20";	
		String c="130";
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int z=Integer.parseInt(c);
		int[] i= {x,y,z};
		System.out.println(i[0]+i[1]);
		System.out.println(i[7]);
		
		System.out.println("Hello");
		//}catch(Exception e) {
			//System.out.println(e);
		//}
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(NullPointerException np) {
			System.out.println(np);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
		catch(StringIndexOutOfBoundsException si) {
			System.out.println(si);
		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
