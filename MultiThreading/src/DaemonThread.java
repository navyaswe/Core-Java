
class ThreadEx extends Thread{}

public class DaemonThread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon()); // isDaemon--false
		Thread.currentThread().setDaemon(true); //Exception
		
		ThreadEx t = new ThreadEx();
		System.out.println(t.isDaemon()); //false
		t.setDaemon(true);
		t.start();
		
		System.out.println(t.isDaemon());//true
		

	}

}
