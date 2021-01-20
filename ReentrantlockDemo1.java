
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockDemo1 {
	
	public static void main(String...strings) {
		
		Wish w = new Wish();
		MyThread12 t = new MyThread12(w,"Akarsha");
		MyThread12 t1 = new MyThread12(w,"Rohan");
		
		t.start();
		t1.start();
	}

}



class MyThread12 extends Thread{
	
	Wish w;
	String name;
	
	MyThread12(Wish w,String name){this.w=w;this.name=name;}
	
	public void run() {
		w.wish(name);
	}
	
} 

class Wish{
	
	ReentrantLock l = new ReentrantLock();
	
	public  void wish(String name) {
		l.lock();
		
	for (int i = 0; i < 10; i++) {
		System.out.print("Hello :");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}
	l.unlock();
	}
}
