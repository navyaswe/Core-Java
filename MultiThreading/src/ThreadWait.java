class ThreadA extends Thread{
	int sum = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread strated calculation");
			for(int i=0;i<=50;i++)
				sum+=i;
			System.out.println("Child thread notifies");
		}
	}
}
public class ThreadWait {

	public static void main(String[] args)throws InterruptedException {
		ThreadA t = new ThreadA();
		t.start();
		Thread.sleep(2000); // main thread in sleep state and not getting notification
		synchronized(t) {
			System.out.println("Main thread calls wait on on t");
			t.wait(); //main thread will never get notification always in wait state
			System.out.println("Main thread receives notification");
			System.out.println(t.sum);
		}

	}

}
