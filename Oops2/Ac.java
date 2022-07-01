package Oops2;

public class Ac extends Summer {
	public String Summer(int temp) {
		if(temp<20) {
			return "high electric";
		}
		else if(temp>20&&temp<24) {
			return "medium";
		}
		else if(temp>24&&temp<30) {
			return "wild";
		}
		else {
			return "switch off";
		}
		
		}
	void show() {
		System.out.println(super.summer(22));
	}
	public static void main(String args[]) {
		Ac a=new Ac();
		System.out.println(a.Summer(20));
		a.show();

	}

}
