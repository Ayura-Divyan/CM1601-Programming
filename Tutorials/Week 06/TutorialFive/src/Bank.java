import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Account> bankAccount = new ArrayList<>();
    public static void main(String[] args) {
        Account acc1 = new Account("33", "Max", new BigDecimal(1000000));
        Account acc2 = new Account("44", "Moritz", new BigDecimal(36230564));

        Bank.bankAccount.add(acc1);
        Bank.bankAccount.add(acc2);
    }
}
