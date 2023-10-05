package lab;

public class Test {
	
	public static void main(String [] args) {
		
		Student s1 = new Student("Yasas" , 255 , "Wedamulla,Kelaniya");
		
		System.out.println("Name :" + s1.getName());
		System.out.println("Dit No :" + s1.getDitno());
		System.out.println("Address :" + s1.getAddress());
		
		System.out.println(s1.getDetails());
		
}
}

