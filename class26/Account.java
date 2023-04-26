package class26;

public class Account {
    double balance;
    String accountNumber;
    String type;
    String accountTitle;

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }

    public Account() {
    }
}
class AccountTester{
    public static void main(String[] args) {
        Account account=new Account(-1000," khkjhj","dhhd", "hjhfkjhj");
        account.balance=-586;
    }

}
