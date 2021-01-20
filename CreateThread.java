
public class CreateThread  {

	
	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main Treadh End");
	}

}


class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thild Thread");
			
		}
	}
