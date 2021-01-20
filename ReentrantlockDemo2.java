
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockDemo2 {
	
	public static void main(String...strings ) {
		MyThread13 t1 = new MyThread13("Thread-1");
		MyThread13 t2 = new MyThread13("Thread-2");
		
		t1.start();
		t2.start();
	}

}


class MyThread13 extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	
	MyThread13(String name){
		super(name);
	}
	
	
	public void run() {
		if(l.tryLock()) {
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe opertion");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				l.unlock();
			}
		}else {
			System.out.println(Thread.currentThread().getName()+ " unable to get the lock hence performing alternate operions");
		}
	}
}
