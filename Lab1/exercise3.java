import java.util.Scanner;

public class exercise3{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Your Age :");
		int age = ob.nextInt();
		
		if(age <= 0){
			System.exit(-1);
		}
		
		if(age > 18){
			System.out.println("You are an adult!");
		}else{
			System.out.println("You are a child!");
		}

	}


}