
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	
	public static void main(String...strings) {
		
		MyThread15[] jobs = {
				new MyThread15("Akarsha"),
				new MyThread15("Rohan"),
				new MyThread15("Pavan"),
				new MyThread15("Honey"),
				new MyThread15("Vijay")
				
		};
		
		 ExecutorService service = Executors.newFixedThreadPool(3);
		 
		 for (MyThread15 myThread15 : jobs) {
			service.submit(myThread15);
		}
		 
		 service.shutdown();
	}

}



class MyThread15 implements Runnable{

	String name;
	MyThread15(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println("job Started by "+name+" "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("job Completed by "+name+" "+Thread.currentThread().getName());
	}
	
	
}
