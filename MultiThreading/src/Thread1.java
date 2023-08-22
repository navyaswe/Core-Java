class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // gives the name of the current thread--main
		MyThread t = new MyThread();
		t.start();
		//After the execution of start(), two threads will be in running state( main and child thread)
		
		for(int i=0;i<5;i++)
			System.out.println("Main Thread");

		/*MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		//After the execution of start(), two threads will be in running state( main and child therad)
		for(int i=0;i<5;i++)
			System.out.println("Main Thread");
	*/
	}

}
