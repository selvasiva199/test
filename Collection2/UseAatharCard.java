package Collection2;
import java.util.HashMap;
import java.util.Iterator;
public class UseAatharCard {
	public static void main(String[] args) {
		AatharCard person1=new AatharCard(33226547,"shwag",40);
		AatharCard person2=new AatharCard(11557643,"sachin",45);
		AatharCard person3=new AatharCard(55667982,"dhoni",39);
		HashMap<Long, AatharCard> aatharDetails=new HashMap<>();
		aatharDetails.put(person1.getAatharNumber(), person1);
		aatharDetails.put(person2.getAatharNumber(), person2);
		aatharDetails.put(person3.getAatharNumber(), person3);
		
		int max=0;
		//for(AatharCard x:aatharDetails.values()) {
			//if(x.getPersonAge()>max) {
				//max=x.getPersonAge();
		
			//}
		//}
				//System.out.println(max);
		aatharDetails.values().forEach((y)->System.out.println((y.getPersonName().substring(1,y.getPersonName().length()-1))));
				
		Iterator<AatharCard> i=aatharDetails.values().iterator();
		while(i.hasNext()) {
			if(i.next().getPersonAge()<40) {
				i.remove();
			}
			
		}
		System.out.println(aatharDetails.values());
			
		for(AatharCard x:aatharDetails.values()) {
			System.out.println(x.getPersonName());
		}
	}

}
