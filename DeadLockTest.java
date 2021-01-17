class A {

	// make foo synchronized to create deadlock
	public  void foo(B b) {
		System.out.println("Thread1 Started foo in class A");
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("calling b.last");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("A Class last method called");
	}
}


class B{
	
	public synchronized void bar(A a) {
		System.out.println("Thread2 Started bar in Class B");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("calling a.last");
		a.last();
		
		
	}
	
	
	public synchronized void last() {
		System.out.println("B Class last method called");
	}
}

public class DeadLockTest implements Runnable{
	A a = new A();
	B b = new B();
	
	DeadLockTest(){
		Thread t = new Thread(this);
		t.start();
		a.foo(b);
	}

	@Override
	public void run() {
		b.bar(a);
		
	}
	
	public static void main(String... a) {
		new DeadLockTest();
	}
	
}
