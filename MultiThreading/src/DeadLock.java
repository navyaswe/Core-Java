class A{
	public void m1(B b) {
		System.out.println("Thread1 executes m1");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("Thread1 trying to call B last method");
		b.last();
	}
	public void last() {
		System.out.println("Class A last method");
	}
}

class B{
	public void m2(A a) {
		System.out.println("Thread2 executes m2");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("Thread2 trying to call A last method");
		a.last();
	}
	public void last() {
		System.out.println("Class B last method");
	}
}
public class DeadLock  extends Thread{
	A a = new A();
	B b = new B();
	public void call() {
		this.start();
		a.m1(b); // executed by main thread
	}
	
	public void run() {
		b.m2(a); // executed by child thread
	}

	public static void main(String[] args)throws InterruptedException {
		DeadLock d=new DeadLock();
		d.call();

	}

}
