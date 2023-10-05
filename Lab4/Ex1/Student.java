package Lab4;

public class Student {
	//declare variables
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	//static variable
	private static int max = 100;
	
	//constructor
	public Student(String name, String degree, String mobile) {
		super();
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	//print method
	public void print() {
		System.out.println("---------Student Details---------");
		System.out.println("Student ID :" + getNextStudentID());
		System.out.println("Student Name :" + name);
		System.out.println("Student Degree :" + degree);
		System.out.println("Student Mobile No :" + mobile + "\n");
	}
	
	//static method
	public static int getNextStudentID(){
		return max++;//we can only access static variables in the static methods
	}
	
	
}
