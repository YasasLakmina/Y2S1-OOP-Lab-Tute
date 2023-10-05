package ex3;

public class BankAccount {
	private int accNo;
	private String name;
	private double balance;
	
	BankAccount(){
		this.accNo = 0;
		this.balance = 0;
		this.name = "";
	}

	public BankAccount(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdrow(double amount) {
		balance = balance - amount;
	}
	
	public void displayDetails() {
		System.out.println("The account no :" + accNo);
		System.out.println("Name of the account :" + name);
		System.out.println("Balance of the account :" + balance);
	}
	
	
	
	
	
}
