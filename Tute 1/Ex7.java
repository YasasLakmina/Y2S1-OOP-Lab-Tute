package tute1;

class Main{
	static int a = 3;
	static int b;
	
	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("This is execute");
	}
	
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}
}



public class Ex7 {
	public static void main(String[] args) {
		Main.meth(42);
		System.out.println("Main");
	}
}
