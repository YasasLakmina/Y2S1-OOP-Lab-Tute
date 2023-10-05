package tute1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		int number;
		int range;
		
		System.out.print("Enter a number :");
		number = ob.nextInt();
		
		System.out.print("Enter the range :");
		range = ob.nextInt();
		
		for(int i = 1 ; i < range ; i++) {
			int ans;
			
			ans = number * i;
			
			System.out.println(number + " * " + i + " = " + ans);
		}
	}

}
