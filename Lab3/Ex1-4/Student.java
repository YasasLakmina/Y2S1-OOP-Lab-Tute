package lab;

public class Student {
	private String name;
	private int ditno;
	private String address;

	public Student(String name, int ditno, String address) {
		super();
		this.name = name;
		this.ditno = ditno;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDitno(int ditno) {
		this.ditno = ditno;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public int getDitno() {
		return ditno;
	}
	public String getAddress() {
		return address;
	}
	
	public String getDetails() {
		
		return "\nI am a Student.\n" + "My name is " + name + "\nI am from " + address + "\nMy dit no is " + ditno;
	}
	
}
