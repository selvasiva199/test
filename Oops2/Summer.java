package Oops2;

public class Summer {
	public String summer(int temp) {
		if(temp>=30) {
			return "high";
		}
		else if(temp>=30&&temp<=25) {
			return "medium";
		}
		else if(temp>=25&&temp<=20) {
			return "cool";
		}
		else {
			return "rain";
		}
		}

	
	}


