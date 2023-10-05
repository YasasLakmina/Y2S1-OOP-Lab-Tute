package Ex3;

import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		Set studentHeight = new HashSet(); 
		
		//input 10 students height as keyboard inputs
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("Enter the height " + (i+1) + " :");
			studentHeight.add(sc.nextInt());
		}
		
		//taversin method(loop through hashset)
		
		for(Object x : studentHeight) {
			System.out.println(x);
		}
		
		
		
	}
}
