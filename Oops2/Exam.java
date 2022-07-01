package Oops2;

public class Exam {
	public int marks(int maths,int phy) {
		return maths+phy;
	}
	public int marks(int maths,int phy,int che) {
		return maths+phy+che;
	}
	public static void main(String args[]) {
		Exam a=new Exam();
		System.out.println(a.marks(90,80));
		System.out.println(a.marks(90,70,50));

	
	}

}
