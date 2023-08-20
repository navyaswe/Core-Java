
public class StaticClass {
	static int a;
	static int b;
	static {
		System.out.println("static block executed");
		a = 10;
		b = 20;
	}
	
	static void display() {
		System.out.println(a);
		System.out.println(b);
	}
	
	int x, y;
	{
		x = 30;
		y = 40;
		System.out.println("Java block/non-static block executed");
		
	}
	
	StaticClass(){
		System.out.println("Constructor");
	}
	
	public void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public static void main() {
		StaticClass sc = new StaticClass();
		StaticClass.display();
		sc.display1();
	}
}
