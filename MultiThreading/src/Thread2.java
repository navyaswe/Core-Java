
class MyThread1 extends Thread{
	@Override
	public void run() {
		
			System.out.println("Run with no args");
	}
	public void run(int i) { // method overloading
		System.out.println("Run with args");
	}
}
public class Thread2 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start(); // Run with no args 
		
		System.out.println(t.getName()); // gives the name of the thread
		
		Thread.currentThread().setName("Custom Thread"); // assign custom names to a thread
		System.out.println(Thread.currentThread().getName()); // Custom Thread
		

	}

}

