package Oops1;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("siva");
		s1.setAge(22);
		
		
		Student s2=new Student();
		s2.setName("hari");
		s2.setAge(20);
		
		Student s3=new Student();
		s3.setName("karthi");
		s3.setAge(21);
		
		Student[] students= {s1,s2,s3};
		int maxAge=students[0].getAge();
		for(int i=0; i<students.length; i++) {
			if(maxAge<students[i].getAge()) {
				maxAge=students[i].getAge();
			}
		}
		System.out.println(maxAge);
			

	
	}

}
