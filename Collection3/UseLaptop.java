package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("lenovo",45000,"black");
		Laptop l2=new Laptop("hp",50000,"white");
		Laptop l3=new Laptop("lenovo",70000,"blue");
		Laptop l4=new Laptop("dell",43000,"white");
		Laptop l5=new Laptop("lenovo",23000,"silver");
		Laptop l6=new Laptop("Acer",60000,"black");
		ArrayList<Laptop>laptopDetails=new ArrayList<>();
		laptopDetails.add(l1);
		laptopDetails.add(l2);
		laptopDetails.add(l3);
		laptopDetails.add(l4);
		laptopDetails.add(l5);
		laptopDetails.add(l6);
		laptopDetails.stream().map(x->x.getBrand().concat(x.getColor())).forEach(y->System.out.println(y));
		//List<String>l=laptopDetails.stream().map(x->x.getBrand().concat(x.getColor())).collect(Collectors.toList());
		//laptopDetails.stream().filter(y->y.getColor().equals("white")).forEach(z->System.out.println(z));
		//List<Laptop>l=laptopDetails.stream().filter(y->y.getColor().equals("white")).collect(Collectors.toList());
		//l.forEach(x->System.out.println(x));
		//long laptopCount= laptopDetails.stream().count();
		//System.out.println(laptopCount);
		//long lenovoCount=laptopDetails.stream().filter(x->x.getBrand().equals("lenovo")).count();
		//System.out.println(lenovoCount);
		//long capsCount=laptopDetails.stream().map(x->x.getBrand().toUpperCase()).count();
		//System.out.println(capsCount);
		
		
	
		
		
		
		
		
		



	}

}
