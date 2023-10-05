public class exercise6{
	public static void main(String[] args){
		int i=1;
		
		while(i < 5){
			System.out.print("* * * * *\t");
			
			for(int j = 4 ; j >= i ; j--){
				System.out.print(" ");
			}

			for(int k = 1 ; k < (i * 2) ; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
					
			
			i++;
		}

		
		
	}
		



}