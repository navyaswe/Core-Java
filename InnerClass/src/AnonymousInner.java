
public class AnonymousInner {
	public void msg() {
		System.out.println("Outer class message");
	}

	public static void main(String[] args) {
		AnonymousInner obj = new AnonymousInner();
		obj.msg();
		
		AnonymousInner obj1 = new AnonymousInner() { 
			public void msg() {
				System.out.println("Inner class message");
			}
		};
		obj1.msg();
	}
}
