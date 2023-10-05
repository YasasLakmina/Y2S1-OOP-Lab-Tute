package tute1;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number :");
		number = ob.nextInt();
		
		if(number < 0) {
			System.out.println("Plese enter the positive integer..");
		}else {
			int fact = 1;
			
			for(int i = 1 ; i <= number ; i++) {
				fact = fact * i;
			}
			
			System.out.println("The factorial of " + number + " is :" + fact);
		}
		
	}
}
