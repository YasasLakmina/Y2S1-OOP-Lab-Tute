package ex3;

public class BankApp {
	public static void main(String[] args) {
		BankAccount b = new BankAccount(2828383 , "Yasas" , 100000);
		
		b.displayDetails();
		
		b.deposit(1000);
		b.withdrow(20000);
		
		b.displayDetails();
	}
}
