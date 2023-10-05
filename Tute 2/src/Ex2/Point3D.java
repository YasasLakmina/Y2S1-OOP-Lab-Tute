package Ex2;

public class Point3D {
	private int x;
	private int y;
	private int z;
	private double distance;
	
	
	public Point3D(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	

	public void distance() {
		distance =  Math.sqrt((x*x) + (y * y) + (z * z));
		
		System.out.println("The Distance is :" + distance);
	}
	
}
