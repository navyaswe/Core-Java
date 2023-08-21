class Exp1{
	public void disp() {
	int a = 10;
	int b = 0;
	int res = a/b;
	System.out.println(res);
}
}
class Exp2{
	public void show()throws Exception{
		Exp1 e= new Exp1();
		e.disp();
		
	}
}

public class ThrowsClass {

	public static void main(String[] args) throws Exception {//ducking the exception
		Exp2 e1 = new Exp2();
		e1.show();

	}

}
