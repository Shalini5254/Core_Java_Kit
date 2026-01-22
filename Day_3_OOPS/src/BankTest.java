class BankAccount {
    String accNo;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println("Balance = " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.accNo = "12345";
        b1.holderName = "Ravi";
        b1.balance = 1000;

        b1.deposit(500);
        b1.showBalance();
    }
}

