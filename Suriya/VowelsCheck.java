package Suriya;

public class VowelsCheck {
	public static void main(String[] args)throws VowelNotFoundException {
		String word="gym";
		try {
		if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")) {
			System.out.println("vowels found");
		}
		else {
			throw new VowelNotFoundException("vowels not");
		}
		}catch(VowelNotFoundException vf) {
			System.out.println("vowels not found");
			System.out.println(vf.getMessage());
			System.out.println(vf);
		}
		System.out.println("hello");
	}

}
