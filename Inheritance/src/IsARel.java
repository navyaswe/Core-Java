class Branch1{
	String name = "Alice";
	int age = 20;
	private int id;
	
	public void show() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Branch2 extends Branch1{
	void display() {
		//id = 1006; error --private members not participated in inheritance
	}
	
}
class Branch3 extends Branch2{}
//class Branch3 extends Branch1{} - not supports 


public class IsARel {

	public static void main(String[] args) {
		Branch2 br  = new Branch2();
		Branch3 br1  = new Branch3();
		br.show();
		br1.show();

	}

}
