import java.math.BigDecimal;

public class Account {
    //Fields
    private  String accountNumber;
    private String ownerName;
    private BigDecimal balance;

    //Methods
    public Account(String accountNumber, String ownerName, BigDecimal openingBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public  void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(amount);
        } else {
            System.out.println("Invalid deposit.");
        }
    }

    public boolean withdraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) > 0) {
            return false; //Insufficient funds
        } else {
            this.balance = this.balance.subtract(amount);
            return true; //Withdrawal successful
        }
    }

    public void comp(BigDecimal amount) {
        if (this.balance.doubleValue() > amount.doubleValue()) {
            System.out.println("True");
        }
    }
}
