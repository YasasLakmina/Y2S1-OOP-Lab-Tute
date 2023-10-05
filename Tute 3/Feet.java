package Lab4;

public class Feet {
	private int feet;
	private int inches;
	
	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	//c)
	public Feet(Feet len) {
		this.feet  = len.feet;
		this.inches = len.inches;
	}
	
	public void add(Feet f1, Feet f2) {
		this.feet = f1.feet + f2.feet;
		this.inches = f1.inches + f2.inches;
		
		if(inches >= 12) {
			this.feet = feet + (inches/12);
			this.inches =(inches%12);
		}
	}
	
	//d)
	public void add(Feet f1) {
		this.feet = feet + f1.feet;
		this.inches =inches + f1.inches;
		
		if(this.inches >= 12) {
			this.feet = feet + inches/12;
			this.inches = (inches%12);
		}
	}
	
	
	//f)
	//public static Feet add(Feet f1, Feet f2){} We can't add this method because this have the same parameters like the above method.the compiler wouldn't know whether to call.this will make this compilation error. 
	
	
	//g)
	public static Feet add(Feet f1 , Feet f2 , Feet f3) {
		
		int totalFeet = f1.feet + f2.feet + f3.feet;
		int totalInches = f1.inches + f2.inches + f3.inches;
		
		if(totalInches >= 12) {
			totalFeet = totalFeet + (totalInches/12);
			totalInches = totalInches%12; 
		}
		
		return new Feet(totalFeet , totalInches);
	}
	
	
	public void print() {
		System.out.println(feet + "'" + inches + "\"");
	}
	
	//e)
	public static void print(Feet f) {
		System.out.println("Length :" + f.feet + "'" + f.inches + "\"");
		
	}
	//b)
	public void print(String msg) {
		System.out.print(msg);
		print();
	}
	
	//g)
	public void println() {
		System.out.println(feet + "'" + inches + "\"");
	}
	
	public static void println(Feet f) {
		System.out.println("Length :" + f.feet + "'" + f.inches + "\"");
		
	}
	
	public void println(String msg) {
		System.out.print(msg);
		print();
	}
}
