
public class ThreadName {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread2 t = new MyThread2();
		System.out.println(t.getName());
		Thread.currentThread().setName("Akarsha");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);
		t.start();
	}

}



class MyThread2 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			
		
			
			
		}
	}
}
