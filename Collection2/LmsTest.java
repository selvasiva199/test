package Collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LmsTest {
	public static void main(String[] args) {
		HashMap<Integer,String>testDetails=new HashMap<>();
		testDetails.put(21,"mani");
		testDetails.put(57, "virat");
		testDetails.put(35,"shewag");
		testDetails.put(45,"shewag");
		//testDetails.remove(35);
		//System.out.println(testDetails);
		//for(Integer i:testDetails.keySet()) {
			//System.out.println(i);
		//}
		//for(String s: testDetails.values()) {
			//System.out.println(s);
		//}
//		for(Integer x:testDetails.keySet()) {
//		String value=testDetails.get(45);
//		System.out.println(value);
//		}
		//System.out.println(testDetails.keySet());
		//System.out.println(testDetails.values());
		//testDetails.keySet().forEach(x->System.out.println(x));
		//testDetails.forEach((x,y)->System.out.println(x+" "+y));
		//Iterator<String> i=testDetails.values().iterator();
		//while(i.hasNext()) {
			
			//System.out.println(i.next());
//		//}
//		Iterator<String> x=testDetails.values().iterator();
//		while(x.hasNext()) {
//			if(x.next().contains("n")) {
//				x.remove();
//			}
//		}
//				System.out.println(testDetails.values());
//			
//				System.out.println(testDetails.get(49));	
//		
		//for(Integer x:testDetails.keySet()) {
//			System.out.println(x);
	//}
		//System.out.println(testDetails.get(45));
		for(Entry<Integer,String> entry:testDetails.entrySet()) {
			if(entry.getKey()==57){
				String name="";
				for(int i=entry.getValue().length()-1; i>=0; i--) {
					name=name+entry.getValue().charAt(i)     ;
				}
				System.out.println(name);
			}
		}
		for(Entry<Integer,String> entry:testDetails.entrySet()) {
			if(entry.getValue()=="shewag"){
				System.out.println(entry.getKey());
			}
		}
		for(Entry<Integer,String>entry:testDetails.entrySet()) {
			if(entry.getKey()==57) {
				System.out.println(entry.getValue());
			}
		}
		for(Entry<Integer,String>entry:testDetails.entrySet()) {
			if(entry.getKey()>50) {
				System.out.println(entry.getValue());
			}
		
		
	}
		for(Entry<Integer,String>ent:testDetails.entrySet()) {
			if(ent.getValue().startsWith("v")) {
			
				System.out.println(ent.getValue());
			}
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
