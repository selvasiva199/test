package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseShoe {
	public static void main(String[] args) {
		Shoe s1=new Shoe("Adidas",8,3000,true,"Sports");
		Shoe s2=new Shoe("Nike",7,4000,true,"Casuals");
		Shoe s3=new Shoe("woodland",10,5000,true,"formal");
		Shoe s4=new Shoe("Puma",7,3500,false,"Sports");
		Shoe s5=new Shoe("Reebok",10,5500,true,"Sports");
		Shoe s6=new Shoe("Adidas",7,7000,true,"Sports");
		Shoe s7=new Shoe("Adidas",8,6000,true,"formal");
		Shoe s8=new Shoe("Puma",6,1000,false,"casuals");
		ArrayList<Shoe>shoeDetails=new ArrayList<>();
		shoeDetails.add(s1);
		shoeDetails.add(s2);
		shoeDetails.add(s3);
		shoeDetails.add(s4);
		shoeDetails.add(s5);
		shoeDetails.add(s6);
		shoeDetails.add(s7);
		shoeDetails.add(s8);
		//shoeDetails.stream().map(x->x.getBrand().substring(1,x.getBrand().length()-1)).forEach(x->System.out.println(x.length()));
		//List<String>l=shoeDetails.stream().map(x->x.getBrand().substring(1,x.getBrand().length()-1)).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z.length()));
		//shoeDetails.stream().map(y->y.isWarrantyAvailable()&&y.getShoeType().equals("Sports")).forEach(x->System.out.println(x));
		//List<Boolean>l=shoeDetails.stream().map(y->y.isWarrantyAvailable()&&y.getShoeType().equals("Sports")).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z));
		//shoeDetails.stream().filter(x->x.getShoeType().equals("Sports"));
		//shoeDetails.stream().map(y->y.getBrand().length());
		//List<Integer>l=shoeDetails.stream().map(y->y.getBrand().length()).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z));
		//shoeDetails.stream().filter(x->x.getBrand().equals("Adidas")&&x.getShoeType().equals("Sports")).forEach(s->System.out.println(s.getPrice()));
		
		//shoeDetails.stream().map(y->y.getPrice());
		//List<Integer>l=shoeDetails.stream().map(y->y.getPrice()).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z));
		//shoeDetails.stream().filter(x->x.getSize()<8);
		//List<Shoe>l=shoeDetails.stream().filter(x->x.getSize()<8).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z.getBrand().toUpperCase()));
		//shoeDetails.stream().filter(x->x.isWarrantyAvailable()==false);
		//List<Shoe>l=shoeDetails.stream().filter(x->x.isWarrantyAvailable()==false).collect(Collectors.toList());
		//l.forEach(z->System.out.println(z.getShoeType().charAt(0)));
		shoeDetails.stream().filter(x->x.getShoeType().equals("Sports")&&x.isWarrantyAvailable()==true);
		List<Shoe>l=shoeDetails.stream().filter(x->x.getShoeType().equals("Sports")&&x.isWarrantyAvailable()==true).collect(Collectors.toList());
		int max=0;
		for(Shoe a:shoeDetails) {
			if(a.getPrice()>max) {
				max=a.getPrice();
			}
		}
		System.out.println(max);
				
			}

			
		
	}


