
class Parent{ // outer class
	static class Child{ // static inner class
		public void disp() {
			System.out.println("Inner class method");
		}
	}
	public void show() {
		System.out.println("Outer class method");
	}
}
public class Static {

	public static void main(String[] args) {
		Parent.Child in = new Parent.Child();
		in.disp();
	    Parent p = new Parent();
	    p.show();

	}

}
