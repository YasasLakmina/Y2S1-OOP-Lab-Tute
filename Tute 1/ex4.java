package tute1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		String text;
		String output = "";
		
		System.out.print("Enter the String :");
		text = ob.nextLine();
		
		int len = text.length();
		
		for(int i = 1 ; i <= len ; i++) {
			
			output = output + text.charAt(len - i);
		}
		
		System.out.print("The reversed output is :" + output);
	}
}
