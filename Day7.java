import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Day7 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"one");
		map.put(2,"two");
		//Iterator<Integer>itr=map.keySet().iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		for(String key:map.values()) {
			System.out.println(key);
			
		}
		map.keySet().stream().forEach(x->System.out.println(x));

	
	}

}
