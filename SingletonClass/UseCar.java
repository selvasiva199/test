package SingletonClass;

public class UseCar {
	public static void main(String[] args) {
		String name = "rajaraman";
			boolean flag = true; 
		for(int i = 0;i<name.length();i++) {
			for(int j = i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					//System.out.println(name.charAt(i));
					flag = false;
				}
				
			}
			if(flag==false) {
				System.out.println(name.charAt(i));
				//break;
			}
			
		}
		
	}

}
