package Day16;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.brand="renault";
		p1.price=5;
		
		Pen p2=new Pen();
		p2.brand="nike";
		p2.price=10;
		
		Pen p3=new Pen();
		p3.brand="cello";
		p3.price=15;
		
		Pen[] pens= {p1,p2,p3};
		String word="";
		String a="";
		for(int i=0; i<pens.length; i++) {
			if(word.length()>=0&&word.length()<=10) {
			a=a.substring(0,word.length()/2);
			
			word=word.concat(pens[i].brand);
		}
			else if(word.length()>10&&word.length()<=20) {
				a=word.substring(word.length()/2,word.length());
			}
		}
		System.out.println(word);
		System.out.println(a);

	
	}	

}
