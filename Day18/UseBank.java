package Day18;

public class UseBank {
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.name="axis";
		b1.address="chennai";
		b1.branch="adayar";
		b1.ifscCode=12435;
	
		
	//	b1.sysOut();
		
		Bank b2=new Bank();
		b2.name="cub";
		b2.address="chennai";
		b2.branch="kodambakkam";
		b2.ifscCode=23451;
		
		//b2.sysOut();
		
		Bank b3=new Bank();
		b3.name="kvb";
		b3.address="chennai";
		b3.branch="perumbakam";
		b3.ifscCode=54326;
		
		//b3.sysOut();
		
		System.out.println(b1.getBranchByIfscCode(b1.ifscCode));
		

	
	}
	

}
