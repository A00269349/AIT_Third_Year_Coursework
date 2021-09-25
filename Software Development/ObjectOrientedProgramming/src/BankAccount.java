public class BankAccount
{
	private double balance;
	
	public BankAccount(){
		this.balance=0;
	}
	
	public BankAccount(double b){
		this.setBalance(b);
	}
	
	public void setBalance(double b){
		this.balance = b;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void lodge(double amount){
		if(amount <= 0){
			System.out.println("Sorry, please enter a positive amount");
		}else{
		System.out.println("lodging: " + amount);
		this.balance = this.balance + amount;
		}
	}
	
	public void withdraw(double amount){
		
		if(amount > this.balance){
			System.out.println("Sorry, Insuficient Funds");
		}else if(amount <= 0){
			System.out.println("Sorry, please enter a positive amount");
		}else{
			System.out.println("withdrawing: " + amount);
			this.balance = this.balance - amount;
		}
	
	}
}
