package Ex2;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		
		//create arrayList
		List<Student> studentList = new ArrayList<>(); 
		
		//add three student details
		studentList.add(new Student(100 , "Yasas" , 3.7));
		studentList.add(new Student(101 , "Sithija" , 3.8));
		studentList.add(new Student(102 , "Nimangi" , 4));
		
		//traversin method to prit all the student details
		
		for(Student x : studentList) {
			System.out.println("Student ID :" + x.getSid());
			System.out.println("Student Name :" + x.getName());
			System.out.println("Student GPA :" + x.getGpa());
			System.out.println();
			
		} 
		
	}
}
