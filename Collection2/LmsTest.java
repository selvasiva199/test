package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String>testDetails=new HashMap<>();
		testDetails.put(21,"mani");
		testDetails.put(57, "virat");
		testDetails.put(35,"sachin");
		testDetails.put(45,"shewag");
		//testDetails.remove(35);
		//System.out.println(testDetails);
		//for(Integer i:testDetails.keySet()) {
			//System.out.println(i);
		//}
		//for(String s: testDetails.values()) {
			//System.out.println(s);
		//}
		//for(Integer x:testDetails.keySet()) {
		//String value=testDetails.get(x);
		//System.out.println(value+" "+x);
		//}
		//System.out.println(testDetails.keySet());
		//System.out.println(testDetails.values());
		//testDetails.keySet().forEach(x->System.out.println(x));
		//testDetails.forEach((x,y)->System.out.println(x+" "+y));
		//Iterator<String> i=testDetails.values().iterator();
		//while(i.hasNext()) {
			
			//System.out.println(i.next());
		//}
		Iterator<String> x=testDetails.values().iterator();
		while(x.hasNext()) {
			if(x.next().contains("n")) {
				x.remove();
			}
		}
				System.out.println(testDetails.values());
			
			
		
	}

}
