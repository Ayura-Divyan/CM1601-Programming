import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Account> bankAccount = new ArrayList<Account>();
    public static void main(String[] args) {
        Account acc1 = new Account("33", "Max", new BigDecimal(1000000));
        Account acc2 = new Account("44", "Moritz", new BigDecimal(36230564));

        Bank.bankAccount.add(acc1);
        Bank.bankAccount.add(acc2);

        //Display method created
        Bank bank = new Bank();
        bank.displayAccount(acc1);
        bank.displayAllAccounts();
    }

    //Display an account method
    public void displayAccount(Account account) {
        System.out.print(account.getAccountNumber() + "     ");
        System.out.print(account.getOwnerName() + "     ");
        System.out.println(account.getBalance());
    }

    //Display all accounts method
    public void displayAllAccounts() {
        for (Account account : Bank.bankAccount) {
            this.displayAccount(account);
        }
    }
}
