
class Display1{
	public synchronized void dispNums() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
			
		}


public synchronized void dispChars() {
	for(int i=65;i<=80;i++) {
		System.out.print((char)i);
	}
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {}
		
	}
}


class ThreadDemo1 extends Thread{
	Display1 d;
	
	ThreadDemo1(Display1 d){
		this.d = d;
		
	}
	@Override
	public void run() {
		d.dispNums();
	}
}

class ThreadDemo2 extends Thread{
	Display1 d;
	
	ThreadDemo2(Display1 d){
		this.d = d;
		
	}
	@Override
	public void run() {
		d.dispChars();
	}
}

public class SyncThread1 {

	public static void main(String[] args)throws InterruptedException {
		Display1 d = new Display1();
		ThreadDemo1 t = new ThreadDemo1(d);
		ThreadDemo2 t1 = new ThreadDemo2(d);
		t.start();
		t1.start();		

	}

}