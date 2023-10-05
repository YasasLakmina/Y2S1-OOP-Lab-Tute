package lab;

public class Dog extends Pet{
	int noOfMasters;

	//parameterized constructor
	public Dog(String n , String o, int a , int m) {
		super(n, o, a);
		this.noOfMasters = m;
	}
	
	//overloaded constructor
	public Dog(String n, String o) {
		super(n, o);
		
	}
	
	public void getDetails() {
		super.showDetails();
		System.out.println("I am a Dog.I have " + this.noOfMasters + " Masters.");
		
	}
}
