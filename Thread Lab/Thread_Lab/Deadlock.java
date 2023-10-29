package Thread_Lab;

public class Deadlock {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		
		threadOne.start();
		threadTwo.start();
	}
	
	static class ThreadOne extends Thread{
		@Override
		public void run() {
			System.out.println("Start Executing Thread 1");
			
			synchronized(lock1) {
				System.out.println("Thread 1 holding lock 1......");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1 is awaiting for the lock 2");
				
				synchronized(lock2) {
					System.out.println("Thread 1 is holding lock 1 & lock 2");
				}
			}			
		}
	}
	
	static class ThreadTwo extends Thread{
		public void run() {
			System.out.println("Start Executing Thread 2");
			
			synchronized(lock2) {
				System.out.println("Thread 2 holding lock 2......");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2 is awaiting for the lock 1");
				
				synchronized(lock1) {
					System.out.println("Thread 2 is holding lock 1 & lock 2");
				}
			}
		}
	}
}
