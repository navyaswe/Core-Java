class JoinThread extends Thread{
	static Thread t;
	@Override
	public void run() {
	try {
		t.join();
	}catch(InterruptedException e) {
		for(int i=0;i<5;i++) 
			System.out.println("Child Thread");
		}
  }
}
public class ThreadJn1 {

	public static void main(String[] args)throws InterruptedException  {
		JoinThread.t = Thread.currentThread(); 
		JoinThread t1 = new JoinThread();
		t1.start();
		//child thread waits until the execution of main thread completes
		for(int i=0;i<5;i++) { 
			System.out.println("Main Thread");
			Thread.sleep(3000);
		
	}
}
}
