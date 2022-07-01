package Oops2;

public class Child extends Human {
	public void eat() {
		System.out.println("child eating");
		
	}
	void show() {
		super.eat();
	}
	public static void main(String args[]) {
		Child c=new Child();
		c.show();
		c.eat();
	}

}
