interface Demo{
	void method1(); // public abstract void method1()
	void method2();
}
abstract class Demo1 implements Demo{
	public void method1() {
		System.out.println("Implementation of method1");
	}
	
}

class Demo2 extends Demo1{

	@Override
	public void method2() {
		System.out.println("Method2 implementation");
		
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		Demo d =new Demo2();
		d.method1();
		d.method2();
		

	}

}
