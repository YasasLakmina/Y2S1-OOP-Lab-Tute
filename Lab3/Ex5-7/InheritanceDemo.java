package lab;

public class InheritanceDemo {
	public static void main(String [] args) {
		Person p1 = new Person("Nimal" , "Colombo");
		
		p1.showDetails();
		
		Student1 s1 = new Student1("Kamal" , "Malabe" , "STD123");
		
		s1.showDetails();
		
		PartTimeStudent p = new PartTimeStudent("Wimal" , "Negambo" , 30);
		
		p.showDetails();
		
	}
}
