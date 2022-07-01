
public class switchprob {
	public void findweekday (String day1) {
		if(day1.equalsIgnoreCase("monday")||day1.equalsIgnoreCase("tuesday")||day1.equalsIgnoreCase("wednesday")||day1.equalsIgnoreCase("thursday")||day1.equalsIgnoreCase("friday")) {
			System.out.print("weekdays ");
		}
		else {
			System.out.print("weekend ");
		}
	}
	public void findweekday(String day2, int month) {
		if(day2.equalsIgnoreCase("monday")||day2.equalsIgnoreCase("tuesday")||day2.equalsIgnoreCase("wednesday")||day2.equalsIgnoreCase("thursday")||day2.equalsIgnoreCase("friday")) {
			System.out.print("weekdays ");
		}
		else {
			System.out.print("weekend ");
		}
		switch(month) {
		case 1: System.out.println("janauary");
		break;
		case 2: System.out.println("feburary");
		break;
		case 3: System.out.println("march");
		break;
		case 4: System.out.println("april");
		break;
		case 5: System.out.println("may");
		break;
		case 6: System.out.println("june");
		break;
		case 7: System.out.println("july");
		break;
		case 8: System.out.println("augest");
		break;
		case 9: System.out.println("september");
		break;
		case 10: System.out.println("october");
		break;
		case 11: System.out.println("november");
		break;
		case 12:System.out.println("december");
		break;
		default: System.out.println("invalid");
		
		
		}
		
}
	public static void main(String[] args) {
		switchprob n = new switchprob();
		n.findweekday("saturday");
		n.findweekday("saturday", 5);
	}
	
}
