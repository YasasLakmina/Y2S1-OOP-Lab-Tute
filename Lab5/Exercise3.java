package Lab5;
 import java.util.Scanner;
 import java.util.InputMismatchException;

public class Exercise3 {
	public static void main(String[] args) {
		int maxSubjects;
		int marks[] = new int[5];
		int total = 0;
		double avg;
		
		Scanner ob = new Scanner(System.in);
		
		
		try {
			System.out.print("Enter the max value :");
			maxSubjects = ob.nextInt();
			
			System.out.println();
			
			for(int i = 0 ; i < maxSubjects ;i++) {
				System.out.print("Enter the mark " + (i+1) + ":");
				marks[i] = ob.nextInt();
				
				total = total + marks[i];
			}
			
			System.out.println();
			
			avg = total / maxSubjects;
			
			System.out.println("Average mark is :" + avg);
			
		}catch(InputMismatchException e){
			System.out.println();
			System.out.println("Error :" + e);
			
		}catch(ArithmeticException e){
			System.out.println();
			System.out.println("Error :" + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Error :" + e.getMessage());
		}finally {
			System.out.println();
			System.out.println("This code will be gurrentied to run");
		}
		
		System.out.println("The End....");
	}
}
