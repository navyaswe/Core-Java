class Disp{
	public synchronized void m1(String msg) {
		System.out.println("Disp class");
		;;
	  synchronized(Disp.class) {
		  for(int i=0;i<=5;i++)
			System.out.println("Hello");  
	  
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(msg);
		}
	}
}
}

class ThreadSample extends Thread{
	Disp d;
	String msg;
	ThreadSample(Disp d, String msg){
		this.d = d;
		this.msg = msg;
	}
	@Override
	public void run() {
		d.m1(msg);
	}
}
public class SyncBlock {

	public static void main(String[] args)throws InterruptedException {
		Disp d = new Disp();
		Disp d1 = new Disp();
		ThreadSample t = new ThreadSample(d,"thread1");
		ThreadSample t1 = new ThreadSample(d,"thread2");
		t.start();
		t1.start();		

	}

}
