
public class SyncTest {
	
	public  static void main(String...strings) {
		Disply d = new Disply();
		MyThread9 t1 = new MyThread9(d);
		MyThread10 t2 = new MyThread10(d);
		
		t1.start();
		t2.start();
		
	}

}



class MyThread9 extends Thread {

	Disply d;

	public MyThread9(Disply d) {
		this.d = d;
	}

	public void run() {
		d.displaynumbers();
	}

}

class MyThread10 extends Thread{
	
	Disply d;
	public MyThread10(Disply d) {this.d=d;}
	public void run() {
		d.displayChars();
	}
}


class Disply {
	
	public synchronized void displaynumbers() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized void displayChars() {
		
		for (int i = 65; i < 75; i++) {
			
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
