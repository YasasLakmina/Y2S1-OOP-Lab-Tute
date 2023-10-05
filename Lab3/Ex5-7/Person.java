package lab;

public class Person {
	
	public String name;
	public String address;
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void showDetails() {
		
		System.out.println("Name is :" + name);
		System.out.println("Address is :" + address);
	}

}
class Student1 extends Person{

	public String studentid;

	public Student1(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Id is :" + studentid);
		
	}
	
}

class PartTimeStudent extends Person {
	private int wHours;

	public PartTimeStudent(String name, String address, int wHours) {
		super(name, address);
		this.wHours = wHours;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Work Hours is :" + wHours);
	}
	
}
