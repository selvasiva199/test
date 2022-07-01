package Collection1;
import java.util.ArrayList;
public class Pen {
	public static void main(String[] args) {
		ArrayList<String>brandName=new ArrayList<>();
		brandName.add("renaults");
		brandName.add("cello");
		brandName.add(2,"finix");
		brandName.add("camlin");
		brandName.add("hero");
		//brandName.remove(2);
		//System.out.println(brandName);
		//String a="";
		//for(int i=0; i<brandName.size(); i++) {
			//a=a+brandName.get(i);
		
			//System.out.println((a));
		//int max=0;
		//String a="";
		//for(String x:brandName) {
			//if(x.length()>max) {
			//max=x.length();
			//a=x;
			//}
		//}
		//System.out.println(a);
		brandName.forEach((xy)->System.out.println((xy)));
		}
		
		}
	


