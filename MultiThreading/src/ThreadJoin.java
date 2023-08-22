class ThreadJn extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) 
			System.out.println("Child Thread");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
}
}
public class ThreadJoin {

	public static void main(String[] args)throws InterruptedException {
		ThreadJn t = new ThreadJn();
		t.start();
		t.join(1000);
		System.out.println("Main Thread"); // main thread waits until the execution of child thread finishes
		

	}

}
