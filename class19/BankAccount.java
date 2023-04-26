package class19;

public class BankAccount {
    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit method from bank account class");
    }
}
class Checking extends BankAccount{ // child class or sub class or derived class

    double interest;
    void transfer(){
        System.out.println("transfer method from checking class");
    }

}
class Saving extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("profit method from saving class");
    }
}
