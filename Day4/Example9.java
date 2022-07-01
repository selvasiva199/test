package Day4;

public class Example9 {
	public static void main(String[] args) {
		String[] x=args[0].split("@");
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		int c=Integer.parseInt(x[2]);
		String[] y=args[1].split("#");
		int a1=Integer.parseInt(y[0]);
		int b1=Integer.parseInt(y[1]);
		int c1=Integer.parseInt(y[2]);
		System.out.println((a+a1)+" "+(b+b1)+" "+(c+c1));
		
		
	}
}
		