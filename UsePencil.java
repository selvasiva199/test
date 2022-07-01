
public class UsePencil {
public static void main(String[] args) {
	Pencil p1=new Pencil();
	p1.brand="absara";
	p1.price=10;
	
	Pencil p2=new Pencil();
	p2.brand="nataraj";
	p2.price=5;
	
	Pencil p3=new Pencil();
	p3.brand="tip";
	p3.price=15;
	
	if (p1.brand.length()>6) {
		System.out.println(p1.brand);
	}
	else if(p2.brand.length()>6) {
		System.out.println(p2.brand);
	}
	else if(p3.brand.length()>6) {
		System.out.println(p3.brand);
	}
	}

}
