@FunctionalInterface
interface FuncInterface {
	/*void display();
}
	public static void main(String[] args) {
		//FuncInterface f = ()->System.out.println("Display method");
		FuncInterface f1 = new FuncInterface() {
			public void display() {
				System.out.println("Display method");
			}
		};
		f1.display();
	*/
	public void add(int a, int b);
}
	public static void main(String[] args) {
		//FuncInterface f = ()->System.out.println("Display method");
		FuncInterface f1 = (int i, int j)->{
			int sum = i+j;
			System.out.println(sum);
		};
		
         f1.add(10, 20);
	}


