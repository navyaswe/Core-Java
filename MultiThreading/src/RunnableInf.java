class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}
public class RunnableInf {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t = new Thread(r1); // calls MyRunnable run()
		t.start();
		
		for(int i=0;i<5;i++)
			System.out.println("Main Thread");

	}

}
