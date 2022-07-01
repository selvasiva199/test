package Oops2;



	public class DistrictBank extends StateBank {
		public int loan(int amount,int interest) {
			return amount-interest;
		}
		public void show() {
			System.out.println(super.loan(5000,500));
		}
		
		public static void main(String args[]) {
			DistrictBank d=new DistrictBank();
			System.out.println(d.loan(5000,500));
			d.show();
			
		
		
	}

	}
	
