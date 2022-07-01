package Collection1;

public class Student {
	private String name;
	private int age;
	private int id;
	private String section;
	private int mark;
	private String gender;
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setSection(String section) {
		this.section=section;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public String getSection() {
		return section;
	}
	public int getMark() {
		return mark;
	}
	public String getGender() {
		return gender;
	}
	
	public Student(String name,int age,int id,String section,int mark,String gender) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.section=section;
		this.mark=mark;
		this.gender=gender;
	}
	public String toString() {
		return "Name="+name+" "+"Age= "+age+" "+"Id= "+id+" "+"Section= "+section+" "+"Mark= "+mark+" "+"Gender= "+gender;
	}

	

	
	}


