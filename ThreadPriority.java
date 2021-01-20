
public class ThreadPriority {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(1);
		
		
		Thread t = new Thread(new MyThread3());
		t.setPriority(9);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Child Thread");
			
		}
		
		
	}
	
} 
