package Oops2;

public class Movie {
	public String movie(int rating) {
		if(rating>4) {
			return "extodinary";
		}
		else if(rating<=4&&rating>=3) {
			return "super";
		}
		else if(rating<=3&&rating>=2) {
			return "good";
		}
		else if(rating<=2&&rating>=1) {
			return "so good";
		}
		else {
			return "not good";
		}
			
	}
	public String movie(String name) {
		if(name.equals("kgf")) {
			return "same name";
		}
		else {
			return "not same";
		}
		}
	
	public static void main(String arg[]) {
		Movie m=new Movie();
		System.out.println(m.movie(1));
		System.out.println(m.movie("kgf"));
	
	}


	}


