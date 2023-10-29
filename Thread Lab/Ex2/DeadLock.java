package Ex2;

public class DeadLock {
	
	public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
    	

        Thread1 thread1 = new Thread1(lock1, lock2);
        Thread2 thread2 = new Thread2(lock1, lock2);

        thread1.start();
        thread2.start();
    }

     
}
class Thread1 extends Thread {
    private Object lock1;
    private Object lock2;

    public Thread1(Object lock1, Object lock2) {
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

class Thread2 extends Thread {
    private Object lock1;
    private Object lock2;

    public Thread2(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        System.out.println("Started Executing Thread 2");

        synchronized (lock2) {  // Acquire lock2 first
            System.out.println("Thread 2 Holding lock 1");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 2 awaiting for lock 2");

            synchronized (lock1) {  // Acquire lock1 second
                System.out.println("Thread 2 Holding Lock 1 & Lock 2");
            }
        }
    }
}