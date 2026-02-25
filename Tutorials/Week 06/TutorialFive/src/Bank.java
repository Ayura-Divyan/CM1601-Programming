import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Account> bankAccount = new ArrayList<Account>();
    public static void main(String[] args) {
        Account acc1 = new Account("33", "Max", new BigDecimal(100));
        Account acc2 = new Account("44", "Moritz", new BigDecimal(36230564));

        Bank.bankAccount.add(acc1);
        Bank.bankAccount.add(acc2);

        //Display method
        Bank bank = new Bank();
        bank.displayAccount(acc1);
        bank.displayAllAccounts();

        //Calculate total balance
        bank.calculateTotalBalance();

        //Comparison method
        System.out.println(acc1.isGreater(new BigDecimal(6564)));

        //
    }

    //Display an account
    public void displayAccount(Account account) {
        System.out.print(account.getAccountNumber() + "     ");
        System.out.print(account.getOwnerName() + "     ");
        System.out.println(account.getBalance());
    }

    //Display all accounts
    public void displayAllAccounts() {
        for (Account account : Bank.bankAccount) {
            this.displayAccount(account);
        }
    }

    public void calculateTotalBalance() {
        BigDecimal totalBalance = new BigDecimal(0);
        for (Account account : Bank.bankAccount) {
            totalBalance = totalBalance.add(account.getBalance());
        }
        System.out.println("Total balance of all accounts: " + totalBalance);
    }
}
