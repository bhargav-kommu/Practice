
public class ThreadGroupDemo {

	
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("BhargavThreads");
		ThreadGroup tg1 = new ThreadGroup(tg,"childGrup");
		System.out.println(tg.getParent().getName());
		System.out.println(tg.getName());
		System.out.println(tg1.getParent().getName());
		System.out.println(tg1.getName());
	}
}
