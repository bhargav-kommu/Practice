
public class YieldDemo {

	public static void main(String[] args) {
		MyThread4 m4 = new MyThread4();
		m4.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
		
	}
}


class MyThread4 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			//Thread.yield();
		}
	}
}
