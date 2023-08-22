class SampleThread extends Thread{}

public class ThreadDefPriority {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority()); //default priority of a thread is 5
		Thread.currentThread().setPriority(10);
		
		SampleThread t = new SampleThread();
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
