package tute1;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		int number = 1;
		int total = 0;
		double avg = 0;
		int count = 0;
		
		while(true) {
			System.out.print("Enter a number :");
			number = ob.nextInt();
			
			if(number < 0) {
				break;
			}
			
			total = total +number;
			count++;
		}
		
		
		
		if(count > 0) {
			avg = (double)total / (double)count;
			System.out.println("Average of the numbers is :" + avg);
		}else {
			System.out.println("No Valid Numbers Entered.");
		}
		
	}
	


}
