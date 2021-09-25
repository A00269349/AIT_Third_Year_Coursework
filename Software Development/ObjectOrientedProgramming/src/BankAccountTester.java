public class BankAccountTester
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount(100);

		System.out.println("a1 balance: " + a1.getBalance());		
		a1.lodge(200);	
		System.out.println("a1 balance: " + a1.getBalance());
		a1.withdraw(39);	
		System.out.println("a1 balance: " + a1.getBalance());
		
		System.out.println(" ");
		System.out.println("*******************");
		System.out.println(" ");
		
		System.out.println("a2 balance: " + a2.getBalance());
		a2.lodge(0);
		System.out.println("a2 balance: " + a2.getBalance());
		a2.withdraw(124);
		System.out.println("a2 balance: " + a2.getBalance());
	}

}








