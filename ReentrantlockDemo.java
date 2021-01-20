
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockDemo {
	
	public static void main(String[] args) {
		
		ReentrantLock r = new ReentrantLock();
		r.lock();
		r.lock();
		System.out.println(r.isLocked());
		System.out.println(r.isHeldByCurrentThread());
		System.out.println(r.getQueueLength());
		r.unlock();
		System.out.println(r.isLocked());
		System.out.println(r.getHoldCount());
		r.unlock();
		System.out.println(r.isLocked());
		System.out.println(r.isFair());
	}

}
