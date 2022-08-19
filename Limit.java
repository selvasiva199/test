import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Limit {
	public static void main(String[] args) {
		String[] name= {"andrew","navin","navin","siva","raja"};
		List<String> li=new ArrayList<>();
		for(String i:name) {
			li.add(i);
		}
			//li.stream().limit(2).forEach(x-> System.out.println(x));
			//li.stream().distinct().forEach(y-> System.out.println(y));
		Stream<String> stream=li.stream();
			boolean anyMatch=stream.anyMatch((value)-> { 
				return value.startsWith("navin"); });
			System.out.println(anyMatch);
			}
		
	
	}


