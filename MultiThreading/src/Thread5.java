
class MyThread4 extends Thread{
	
	@Override
	public void start() { 
		super.start();
		System.out.println("Start method");
	}
	
	@Override
	public void run() {
			
			System.out.println("Run method");
	}
}
public class Thread5 {

	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		t.start(); 
		System.out.println("Main method");
		

	}

}