class Outer{
	class Inner{
		public void InMethod() {
			System.out.println("Inner class method");
		}

		
}
	
	public void outMethod() {
		System.out.println("Outer class method");
		Inner in = new Inner();
		in.InMethod(); // calls inner class method
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod();
		Outer.Inner io = new Outer().new Inner(); // creating inner class object with outer class reference
		io.InMethod();
	
		
	}

}
