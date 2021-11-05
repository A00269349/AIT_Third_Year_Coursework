/**
 * @author Raphael Salaja
 * @version 13/10/21
 */
public class ATM_Simulator {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        account.setBalance(1000);

        Company company = new Company(account);
        Runnable runnable_company = company;
        Thread thread_company = new Thread(runnable_company);

        Bank bank = new Bank(account);
        Runnable runnable_bank = bank;
        Thread thread_bank = new Thread(runnable_bank);

        System.out.printf("Account : Initial Balance: %f\n", account.getBalance());

        thread_company.start();
        thread_bank.start();

        thread_company.join();
        thread_bank.join();

        System.out.printf("Account : Final Balance: %f\n", account.getBalance());
    }
}
