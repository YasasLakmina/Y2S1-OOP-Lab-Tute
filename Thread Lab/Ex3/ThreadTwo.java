package Ex3;

public class ThreadTwo extends Thread{
	 	private Object lock1;
	    private Object lock2;

	    public ThreadTwo(Object lock1, Object lock2) {
	        this.lock1 = lock1;
	        this.lock2 = lock2;
	    }

	    public void run() {
	        System.out.println("Started Executing Thread 2");

	        synchronized (lock1) {  // Acquire lock1 first
	            System.out.println("Thread 2 Holding lock 1");

	            try {
	                Thread.sleep(10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            System.out.println("Thread 2 awaiting for lock 2");

	            synchronized (lock2) {  // Acquire lock2 second
	                System.out.println("Thread 2 Holding Lock 1 & Lock 2");
	            }
	        }
	    }
}
