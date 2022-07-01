package Day8;

public class ForLoop12 {
	public static void main(String[] args) {
		String name = "rajaraman";
		char a[] = name.toCharArray();
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		String name1 = "rajaraman";
//		char[] b = name.toCharArray();
//		for (int i = b.length - 1; i > 0; i--) {
//			System.out.println(b[i]);
//		}
//		String name2 = "rajaraman";
//		for (int i = 0; i > name2.length() / 2; i++) {
//			System.out.println(i);
//		}
//		String name3 = "rajaraman";
//		for (int i = (name3.length() / 2) - 1; i >= 0; i--) {
//			System.out.println(name3.charAt(i));
//		}
	String name4 = "rajaraman";
	int n = 1 ;
		for (int i = name4.length()/2; i >= 0; i--) {
			
			System.out.println(name4.charAt(name4.length()-n));
			n++;
		}

	}

}
