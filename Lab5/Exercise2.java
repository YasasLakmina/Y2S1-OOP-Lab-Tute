package Lab5;

interface ICompute{
	//creating abstract methods of ICompute interface
	double calculate();
	void display();
	
}

class Person implements ICompute{
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	//parameterized constructor
	public Person(String name, double basicSal, double otRate, double otHrs) {
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}
	
	//getters and setters of Person class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getOtRate() {
		return otRate;
	}

	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}

	public double getOtHrs() {
		return otHrs;
	}

	public void setOtHrs(double otHrs) {
		this.otHrs = otHrs;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	
	//overriding the abstract methods of interface class
	public double calculate() {
		return netSal = basicSal + (otRate*otHrs);
	}
	public void display() {
		System.out.println("Name :" + getName());
		System.out.println("Net Salary :" + getNetSal());
	}
}

class Box implements ICompute{
	private int length, width,height;
	private int volume;
	
	//parameterized constructor
	public Box(int length, int width , int height) {
		this.length = length;
		this.width = width;
		this.height = height; 
	}
	
	//getters and setters of Box class
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//overriding the abstract methods of interface class
	public double calculate() {
		
		volume = length * width * height;
		
		return volume;
	}
	public void display() {
		System.out.println("Volume :" + getVolume());
	}
	
}

public class Exercise2 {
	public static void main(String[] args) {
		ICompute ob1 = (ICompute) new Person("Danushka" , 40000 , 1000, 5);
		ob1.calculate();
		ob1.display();
		
		ICompute ob2 = new Box(10,20,30);
		ob2.calculate();
		ob2.display();
		
	}
}
