
public class OuterClass {
	    // inner class inside a local method of a outer class
		public void outDisp() {
			class Inner{
				public void inDisp() {
					System.out.println("Inner class method");
				}
			}
			System.out.println("Outer class method");
			Inner in = new Inner();
			in.inDisp();
		}
		
	
		public static void main(String[] args) {
			OuterClass out = new OuterClass();
			out.outDisp();

		}



	
}
