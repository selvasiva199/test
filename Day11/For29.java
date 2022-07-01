package Day11;

public class For29 {
	public static void main(String[] args) {
		String[] name= {"mani","raja", "ram", "vidhya"};
		int j=1;
		for(int i=0; i<name.length; i++) {
			int num=name[i].length()-1;
		
		
		System.out.println(name[i].charAt(num));
		j++;
		}
		
			System.out.println(name[0].charAt(name[0].length()-1)+" "+name[1].charAt(name[1].length()-2)+" "+name[2].charAt(name[2].length()-3));
		
			
		


	}

}
