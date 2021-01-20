
public class YieldExample {

	public static void main(String[] args) {
		
		MyThread6.mt = Thread.currentThread();
		
		MyThread6 mt6 = new MyThread6();
		mt6.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
}


class MyThread6 extends Thread{
	
	static Thread mt;
	public void run() {
		
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
