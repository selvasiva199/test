package Collection1;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		
		Student s1=new Student("Siva",22,101,"a",350,"male");
		Student s2=new Student("karthi",21,102,"b",351,"male");
		Student s3=new Student("raja",23,103,"c",354,"male");
		Student s4=new Student("nanthini",25,104,"d",355,"female");
		Student s5=new Student("gayathiri",29,105,"e",359,"female");
		Student s6=new Student("sasi",30,106,"f",490,"female");
		Student s7=new Student("balaji",32,107,"b",379,"male");
		Student s8=new Student("naveen",33,108,"c",210,"male");
		Student s9=new Student("nagesh",26,109,"a",450,"male");
		Student s10=new Student("sabari",28,110,"c",468,"male");
		ArrayList<Student> li=new ArrayList<>();
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
		//for(int i=0; i<li.size(); i++) {
			//System.out.println(li.get(i));
			
		//li.forEach((y)->{if(y.getAge()%2!=0){System.out.println(y);}});
		//li.forEach((y)-> System.out.println(y));
		ArrayList<Student> lii=new ArrayList<>();
		//for(int i=0; i<li.size(); i++) {
			//if(li.get(i).getGender().equalsIgnoreCase("female")) {
			//lii.add(li.get(i));	
			//}
		//}
		//System.out.println(lii);
		for(Student x:li) {
			if(x.getGender().equalsIgnoreCase("male")) {
				lii.add(x);
			}
		}
			System.out.println(lii);
			
		
	}

}
