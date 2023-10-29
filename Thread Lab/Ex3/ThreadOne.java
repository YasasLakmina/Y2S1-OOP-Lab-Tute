package Ex3;

public class ThreadOne extends Thread{
		private Object lock1;
	    private Object lock2;

	    public ThreadOne(Object lock1, Object lock2) {
	        this.lock1 = lock1;
	        this.lock2 = lock2;
	    }

	    public void run() {
	        System.out.println("Stared Executing Thread 1");

	        synchronized (lock1) {
	            System.out.println("Thread 1 Holding lock 1");

	            try {
	                Thread.sleep(10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            System.out.println("Thread 1 awaiting for lock 2");

	            synchronized (lock2) {
	                System.out.println("Thread 1 Holding Lock 1 & Lock 2");
	            }
	        }
	    }
}
