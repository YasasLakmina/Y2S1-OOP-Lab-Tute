package lab;

public class Cat extends Pet {
	
	private int livesLeft;

	public Cat(String n, String o, int a , int l) {
		super(n, o, a);
		this.livesLeft = l;
		
	}
	//overloaded constructor
	public Cat(String n, String o) {
		super(n,o);
	}
	
	public void getDetails() {
		super.showDetails();
		System.out.println("I am a cat." + this.livesLeft + " lives remain for me.");
	}

}
