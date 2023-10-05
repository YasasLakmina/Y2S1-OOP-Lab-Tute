import java.util.Scanner;

public class exercise4{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);

		System.out.print("Enter the Value :");
		int value = ob.nextInt();

		switch (value){

		case 1 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Monday" + "\nGood Bye!");
			break;
				
		case 2 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Tuesday" + "\nGood Bye!");
			break;

		case 3 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Wednesday" + "\nGood Bye!");
			break;

		case 4 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Thursday" + "\nGood Bye!");
			break;
			
		case 5 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Friday" + "\nGood Bye!");
			break;

		case 6 : 
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Saturday" + "\nGood Bye!");
			break;

		case 7 :
			System.out.println("Value of the day :" + value);
			System.out.println("Day of the week : Sunday" + "\nGood Bye!");
			break;

		default :
		
			System.out.println("Invalid Day!");
		}	
	}



}