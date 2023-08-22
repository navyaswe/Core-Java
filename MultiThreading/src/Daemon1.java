class ThreadEx1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class Daemon1 {

	public static void main(String[] args) {
		ThreadEx1 t = new ThreadEx1();
		t.setDaemon(true);
		t.start();
		System.out.println("Main thread");

	}

}
