package Day16;

public class UseOneSoft{
	public static void main(String[] args) {
		OneSoft o1=new OneSoft();
		o1.name="gothernburg";
		o1.noOfStudents=100;
		o1.noOfBoards=20;
		
		OneSoft o2=new OneSoft();
		o2.name="fjord";
		o2.noOfStudents=150;
		o2.noOfBoards=10;
		
		OneSoft o3=new OneSoft();
		o3.name="bristol";
		o3.noOfStudents=50;
		o3.noOfBoards=30;
		
		OneSoft[] onesofts= {o1,o2,o3};
		String word="";
		String a="";
		String b="";
		for(int i=0; i<onesofts.length; i++) {
			
			word=word+onesofts[i].name;
			a= a.concat(onesofts[i].name);
			
			if(a.length()>=10) {
			b=a.toUpperCase();
			b=a.toLowerCase();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		System.out.println(word);
		System.out.println(b);
		System.out.println(b);
	}

}
