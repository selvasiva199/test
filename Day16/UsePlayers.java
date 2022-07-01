package Day16;

public class UsePlayers {
	public static void main(String[] args) {
		Players p1=new Players();
		p1.name="sachin";
		p1.age=49;
		p1.runs=18000;
		p1.jersyNo=10;
		
		Players p2=new Players();
		p2.name="dhoni";
		p2.age=39;
		p2.runs=10000;
		p2.jersyNo=7;
		
		Players p3=new Players();
		p3.name="virat";
		p3.age=33;
		p3.runs=12000;
		p3.jersyNo=18;
		
		Players p4=new Players();
		p4.name="rohith";
		p4.age=34;
		p4.runs=11000;
		p4.jersyNo=45;
		
		Players[] player= {p1,p2,p3};
		String a="";
		int ind=0;
		
		for(int i=0; i<player.length; i++) {
			
			if(player[i].name.startsWith("s")) {
				ind=i;
				
			
			
			if(player[ind].runs%2==0) {
			System.out.println("odd");
			}
			else {
				System.out.println("evan");
			}
			}	
		}
		System.out.println(player[ind].name+" "+player[ind].runs+" "+player[ind].age+" "+player[ind].jersyNo);
		
	
		

	}

}
