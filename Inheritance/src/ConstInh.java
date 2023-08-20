class Parent{
	final int a,b;
	Parent(){
		
		a =10;
	    b = 20;
		System.out.println("Parent constructor");
	}
	
	Parent(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Parent's Parameterized Constructor");
	}
}

class Child extends Parent{
	int x,y;
	Child(){
		super(); // calls parent constructor
		x= 30;
		y= 40;
		System.out.println("Child Constructor");
	}
	Child(int x, int y){
		this.x =x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class ConstInh {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.disp();

	}

}
