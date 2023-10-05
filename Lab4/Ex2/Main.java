package Lab4;

public class Main {
	public static void main(String[] args) {
		Feet f = new Feet(5,6);
		f.print("Length :");
	
		Feet mylength = new Feet(5,6);
		Feet newlen = new Feet(6,7);
		
		mylength.add(newlen);
		mylength.print("Length :");
		
		Feet.print(mylength);
		
		Feet f5 = Feet.add(f, mylength, newlen);
		f5.print(f5);
		
	}
	
	
}
