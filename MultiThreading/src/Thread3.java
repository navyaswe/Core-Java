
class MyThread2 extends Thread{
	@Override
	public void run() {
		
			System.out.println("Run method");
	}
	@Override
	public void start() { 
		System.out.println("Start method");
	}
}
public class Thread3 {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start(); // Start method 
		

	}

}
