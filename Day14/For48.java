package Day14;

public class For48 {
	public static void main(String[] args) {
		String[] words= {"java","python","c++","css"};
		String minword=words[0];
		int lenmin=words[0].length();
		String min2="";
		
				for(int i=0; i<words.length; i++) {
					if(lenmin>words[i].length()) {
						lenmin=words[i].length();
						minword=words[i];
					
			
						
					}
					else if(lenmin==words[i].length()) {
						min2=words[i];
					}
				}
				System.out.println(lenmin);
				System.out.println(minword);
				System.out.println(lenmin+minword+min2);

	
	}

}
