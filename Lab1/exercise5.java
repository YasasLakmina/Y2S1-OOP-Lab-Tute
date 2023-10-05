public class exercise5{
	public static void main(String[] args){
		int count=0;
		
		while(count < 5){
			System.out.println("* * * * *");
			
			count++;
		}

		
		for(int i = 1 ; i < 5 ; i++){
			
			for(int j = 4 ; j >= i ; j--){
				System.out.print(" ");
			}

			for(int k = 1 ; k < (i * 2) ; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
					
		}
	}
		



}