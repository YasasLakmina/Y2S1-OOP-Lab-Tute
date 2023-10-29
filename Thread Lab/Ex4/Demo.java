package Ex4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Map<String,Integer> number1 = new LinkedHashMap<String,Integer>();
		
		T1 t1 = new T1(number1);
		T2 t2 = new T2(number1);
		
		t1.start();
		t2.start();
	}
}

class T1 extends Thread{
	
	Map<String,Integer> number1;
	

	public T1(Map<String, Integer> number1) {
		super();
		this.number1 = number1;
	}
	
	public void run() {
		
		synchronized (number1 ) {
			System.out.println("Thread 1 has started");
			
			Scanner sc = new Scanner(System.in);

			
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print("Please Enter Number 1: ");
				int n1 = sc.nextInt();
				
				System.out.print("Please Enter Number 2: ");
				int n2 = sc.nextInt();
				
				number1.put(n1 + "*" + n2 + "=" , n1*n2);
				
			}
			
			System.out.println("Thread 1 goes to the waiting state\n");
				
				try {
					number1.wait();
					T1 t1 = new T1(number1);
					t1.start();
					
					T2 t2 = new T2(number1);
					t2.start();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	
}

class T2 extends Thread{
	Map<String,Integer> number1;

	public T2(Map<String, Integer> number1) {
		super();
		this.number1 = number1;
	}
	
	public void run() {
		
		synchronized(number1) {
			System.out.println("Thread 2 started");
			System.out.println("Output is n1 * n2");
			
			for(Map.Entry<String,Integer> entry : number1.entrySet() ){
				System.out.print(entry.getKey());
				System.out.println(entry.getValue());
			}
			
			System.out.println("Thread 1 Notified");
			number1.notify();
		}
		}
		
		
}