
public class VarArgs1 {
	public void test(int ...x) {
		System.out.println("var args method");
	}
	public void test(int x) {
		System.out.println("int arg method");
	}

	public static void main(String[] args) {
		VarArgs1 v1 = new VarArgs1();
		v1.test();
		v1.test(null);
		v1.test(100);
		v1.test(100,200,300);
		
		

	}

}
