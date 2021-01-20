
public class JoinTest {

	public static void main(String[] args) {
		
		Thread5 t5 = new Thread5();
		t5.start();
		try {
			//main calling join on child thread 
			t5.join();
			//t5.join(10000); main waits only for 10 seconds 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}


class Thread5 extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
