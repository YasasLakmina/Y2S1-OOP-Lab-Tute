package ex1;

public class Ex1 {
	private String name;
	private String id;
	private int mark1,mark2,mark3;
	private double average;
	
	/**
	 * @param name
	 * @param id
	 */
	public Ex1(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Ex1() {
		this.mark1 = 0;
		this.mark2 = 0;
		this.mark3 = 0;
	}
	
	public void calAverage() {
		average = (mark1 + mark2 + mark3)/3;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	public void showDetails() {
		System.out.println("Student Name :" + name);
		System.out.println("Student Id :" + id);
		System.out.println("Mark Average :" + average);
	}
}
