package Day4;

public class UseLlaptop {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=args[0].split(",");
		Laptop l1=new Laptop();
		l1.brand=a[0].toUpperCase();
		l1.color=a[1].toLowerCase();
		l1.price=Integer.parseInt(a[2]);
		l1.discount=Integer.parseInt(a[3]);
		l1.netPrice=l1.price-l1.discount;
		l1.isWarranty=Boolean.parseBoolean(a[4]);
		
		String[] b=args[1].split("@");
		Laptop l2=new Laptop();
		l2.brand=b[0].toLowerCase();
		l2.color=b[1].toLowerCase();
		l2.price=Integer.parseInt(b[2]);
		l2.discount=Integer.parseInt(b[3]);
		l2.netPrice=l2.price-l2.discount;
		l2.isWarranty=Boolean.parseBoolean(b[4]);
		
		
//		String[] c=args[3].split("/");
//		Laptop l3=new Laptop();
//		l3.brand=c[0].toLowerCase();
//		l3.color=c[1].toLowerCase();
//		l3.price=Integer.parseInt(c[2]);
//		l3.discount=Integer.parseInt(c[3]);
//		l3.netPrice=l3.price-l3.discount;
//		l3.isWarranty=Boolean.parseBoolean(c[4
		
		System.out.println("BRAND=" +l1.brand+","+"COLOR=" +l1.color+","+"NETPRICE=" +l1.netPrice+","+"ISWARRANTY=" +l1.isWarranty);
		System.out.println("BRAND=" +l2.brand+","+"COLOR=" +l2.color+","+"NETPRICE=" +l2.netPrice+","+"ISWARRANTY=" +l2.isWarranty);
		//System.out.println("BRAND=" +l3.brand+","+"COLOR=" +l3.color+","+"NETPRICE=" +l3.netPrice+","+"ISWARRANTY=" +l3.isWarranty);
		System.out.println(l1.brand.length()+l2.brand.length());
		System.out.println(l1.brand.charAt(0));
		System.out.println(l1.brand.charAt(l1.brand.length()-1));
	


	}

}
