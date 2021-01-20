
public class InteruptThread {
	

	public static void main(String[] args) {
		MyThread7 m = new MyThread7();
		m.start();
		m.interrupt();
		System.out.println("End of main method");
	}
}



class MyThread7 extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Sleeping thread : child");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("i got inturupted");
			}
		}
		
	}
}
