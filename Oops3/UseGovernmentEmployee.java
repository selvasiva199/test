package Oops3;

public class UseGovernmentEmployee {
	public static void main(String[] args) {
		GovernmentEmployee g=new GovernmentEmployee();
		g.salaryperHour=500;
		g.workingHour=8;
		System.out.println("work="+g.work("registration")+" salary="+g.showSalary(g.salaryperHour,g.workingHour));
	}

}
