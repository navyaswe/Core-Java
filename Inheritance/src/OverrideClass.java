class Parent{
	int a = 10, b = 20;
	String name;
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
	} 
	
	protected void show(String name) {
		this.name = name;
	}
	
}

class Child extends Parent{
	int x = 30, y = 40, age;
	String name;
	
	//private void disp() - we can't reduce the override method's visbility in child class.
	//void disp()--we can't reduce the override method's visbility in child class. We can increase the visibility of override method in child class
	public void disp() {
		
		System.out.println(x);
		System.out.println(y);
	}
	/*
	//public void show(String name, int age){ -- parameters should be same that of parent class or else considered as method overloading
	    this.name = name;
	    this.age = age;
	    System.out.println(name);
	    System.out.println(no);
	} 
	*/
}


public class OverrideClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.disp();
	}

}
