
public class SynchronizedBlockDemo {
	
	public static void main(String[] args) {
		
	
	
	Hello h = new Hello();
	MyThread11 t1 = new MyThread11(h,"Rohan");
	MyThread11 t2 = new MyThread11(h,"Akarsha");
	
	t1.start();
	t2.start();
	
	}

}




class MyThread11 extends Thread{

	Hello h ;
	String name;
	
	MyThread11(Hello h,String name){this.h=h;this.name=name;}

	public void run() {
		h.hello(name);
	}
}

class Hello{
	
	
	public void hello(String name) {
		
		;;;;;;;;;;// n lines of code
		synchronized(this) {
		//synchronized(Hello.class) {
		
		for (int i = 0; i <10 ; i++) {
			System.out.print("hello :");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		}
		;;;;;;;;;;//n lines of code
	}
}
