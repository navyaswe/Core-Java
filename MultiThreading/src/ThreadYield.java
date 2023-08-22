class ThreadYd extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		Thread.yield(); // pauses the execution of current running thread
	}
}
}
public class ThreadYield {

	public static void main(String[] args) {
		ThreadYd t = new ThreadYd();
		t.start();
		System.out.println("Main Thread");

	}

}
