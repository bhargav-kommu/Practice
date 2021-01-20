
public class SynchronizedDemo {

	public static void main(String...strings) {
		Display d = new Display();
		Display d1 = new Display();
		MyThread8 m1 = new MyThread8(d,"Akarsha");
		MyThread8 m2 = new MyThread8(d,"Bhargav");
		MyThread8 m3 = new MyThread8(d1,"Rohan");
		
		m1.start();
		m2.start();
		m3.start();
	}
	
	
}



class MyThread8 extends Thread{
	
	Display d;
	String name;
	
	MyThread8(Display d, String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.display(name);
	}
}

class Display{
	
	//if we remove synchronized out put will be irregular
	public static synchronized void display(String name){
		
		for (int i =1; i <= 10; i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
