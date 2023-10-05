package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		Ex1 s1 = new Ex1("Yasas" , "IT22305350");
		
		System.out.print("Enter the First Mark :");
		s1.setMark1(ob.nextInt());
		
		System.out.print("Enter the Second Mark :");
		s1.setMark2(ob.nextInt());
		
		System.out.print("Enter the Third Mark :");
		s1.setMark3(ob.nextInt());
		
		s1.calAverage();
		s1.showDetails();
		
	}
}
