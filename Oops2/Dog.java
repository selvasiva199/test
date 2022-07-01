package Oops2;

public class Dog extends Cat {
	public void bark() {
		System.out.println("bow...bow");
	}
	 void show() {
		super.bark();
	}
	public static void main(String args[]) {
		Dog d=new Dog();
		d.show();
		d.bark();
		
	}
		

	
	}


