package Day18;

public class Bank {

	String name;
	String address;
	String branch;
	int ifscCode;
	
	public void sysOut() {
		System.out.println("NAME="+name+"ADDRESS="+address+"BRANCH="+branch+"IFSCCODE="+ifscCode);
	}
	public String getBranchByIfscCode(int a) {
		String g="";
		if(a==ifscCode) {
		g=branch;
		}
		return g;
		
	}
	public int getTaxAmount(int b,int c) {
		return c;
		
	}
	

}
