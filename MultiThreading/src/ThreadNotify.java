class ThreadB extends Thread{
	int sum = 0;
	public void run() {
		synchronized(this) {
			System.out.println("Child thread strated calculation");
			for(int i=0;i<=50;i++)
				sum+=i;
			System.out.println("Child thread notifies");
			this.notify();
		}
	}
}
public class ThreadNotify {

	public static void main(String[] args)throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		
		synchronized(t) {
			System.out.println("Main thread calls wait on on t");
			t.wait(1000); 
			System.out.println("Main thread receives notification");
			System.out.println(t.sum);
		}

	}

}
