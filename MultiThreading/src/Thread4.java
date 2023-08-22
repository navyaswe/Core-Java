
class MyThread3 extends Thread{
	@Override
	public void run() {
		
			System.out.println("Run method");
	}
	@Override
	public void start() { 
		System.out.println("Start method");
	}
}
public class Thread4 {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start(); 
		System.out.println("Main method");
		

	}

}