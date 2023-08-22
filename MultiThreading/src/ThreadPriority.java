class ThreadPr extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Child Thread");
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		ThreadPr t = new ThreadPr();
		t.setPriority(10);
		t.start();
		System.out.println("Main Thread");

	}

}
