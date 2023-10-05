package Lab4;

public class StudentApp {
	public static void main(String[] args) {
		Student ob[] = new Student[5];//creating an array of objects
		
		ob[0] = new Student("Kamal" , "IT", "022112332" );
		
		ob[1] = new Student("Nimal" , "IT", "022123323" );
		
		ob[2] = new Student("Rajapakse" , "CSNE", "024092334" );
		
		ob[3] = new Student("Perera" , "ISE", "04492334" );
		
		ob[4] = new Student("Amal" , "SE", "033492334" );
		
		for(int i = 0 ; i < 5 ; i++) {
			ob[i].print();
		}
	}
}
