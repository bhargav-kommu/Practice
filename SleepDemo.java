public class SleepDemo {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Slide "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
