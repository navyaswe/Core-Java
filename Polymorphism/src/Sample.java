class Parent{
	public void study(){
		System.out.println("parent class method");
		}
}

class child1 extends Parent{
	public void study() { // method overriding
		System.out.println("child1 method");
	}
}
class child2 extends Parent{
	public void study() { // method overriding
		System.out.println("child2 method");
	}
}
public class Sample {
	public static void main() {
		// tight coupling
		child1 c1 = new child1();
		child2 c2 = new child2();
		c1.study();
		c2.study();
		
		/*using parent class reference calling child class methods (loose coupling)
		 
		 Parent p = c1;
		 c1.study();
		 Parent p1 = c2;
		 c2.study();
		 */
		
		// Run-time polymorphism
		Parent ch1 = new child1();
		ch1.study();
		Parent ch2 = new child1();
		ch2.study();
		
		
		}

}
