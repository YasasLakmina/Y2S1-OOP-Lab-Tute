package Ex4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Ex2.Student;

public class Ex4 {
	public static void main(String[] args) {
		//create map of a student
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		//create object using student class
		Student s = new Student(100 , "Yasas" , 3.7);
		Student s1 = new Student(101 , "Sithija" , 3.8);
		Student s2 = new Student(102 , "Nimangi" , 4);
		
		//add student to map
		map.put(s.getSid(), s);
		map.put(s1.getSid(), s1);
		map.put(s2.getSid(), s2);
		
		//enter student id as a keyboard input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID :");
		int id = sc.nextInt();
		
		Student st = map.get(id);
		
		st.print();
		
	}
}
