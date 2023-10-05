package Ex1;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		listGenericTotal(addElementGenericArray());
	}
	
	public static List<Integer> addElementGenericArray(){
		
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty()) 
			System.out.println("List is Empty");
			
			System.out.println("Please Enter Value:");
			
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("Enter Value " + (i+1));
				list.add(sc.nextInt());
			}
		
		return list;
		
		}


	public static void listGenericTotal(List<Integer> list) {
		int total = 0;
		int i = 0;
		
		for(Integer x : list) {
			total= total + x;
			System.out.println("Value" + (i+1) + ":" + x);
		}
		System.out.println("Total is :" + total);
	}

	

}


