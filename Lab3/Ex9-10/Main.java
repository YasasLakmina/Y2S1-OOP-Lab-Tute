package lab;

public class Main {
	public static void main(String [] args) {
		Pet p = new Pet("Lissie" , "Smith" , 3);
		p.showDetails();
		
		//overloaded method
		Pet p1 = new Pet("Kitty" , "Jhon");
		p1.showDetails();
		
		Cat c = new Cat("Kyan" , "Silva" , 4 , 4);
		c.getDetails();
		
		Cat c1 = new Cat("Kittys" , "Kamal");
		c1.getDetails();
		
		Dog d = new Dog("Tommy" , "Nimal" , 7 , 1);
		d.getDetails();
		
		//overloaded method
		Dog d1 = new Dog("Browny" , "Sunil");
		d1.getDetails();
	}
}
