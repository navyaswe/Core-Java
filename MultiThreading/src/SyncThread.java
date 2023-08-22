class Display{
	public synchronized void m1(String msg) {
		for(int i=0;i<5;i++) {
			System.out.println("m1 method:"+msg);
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(msg);
		}
	}
}

class ThreadDemo extends Thread{
	Display d;
	String msg;
	ThreadDemo(Display d, String msg){
		this.d = d;
		this.msg = msg;
	}
	@Override
	public void run() {
		d.m1(msg);
	}
}
public class SyncThread {

	public static void main(String[] args)throws InterruptedException {
		Display d = new Display();
		ThreadDemo t = new ThreadDemo(d,"thread1");
		ThreadDemo t1 = new ThreadDemo(d,"thread2");
		t.start();
		t1.start();		

	}

}
