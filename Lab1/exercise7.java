import java.util.Scanner;

public class exercise7{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the 1st Value :");
		int no1 = ob.nextInt();

		System.out.print("Enter the 1st Value :");
		int no2 = ob.nextInt();

		int sum = no1 + no2;
		int average = sum/2;

		System.out.println("The sum of the two numbers is :" + sum);
		System.out.println("The average of the two numbers is :" + average);
	
	}






}