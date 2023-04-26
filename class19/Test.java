package class19;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=788844444l;
        ba.money=1000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println(" create object of checking ***************");
        Checking check=new Checking();
        check.accountNumber=6765;
        check.money=780;
        check.interest=0;

        check.deposit();
        check.transfer();
        System.out.println(" create object of checking ***************");

        Saving save=new Saving();
        save.accountNumber=788844444l;
        save.money=7656;
        save.profit=100;

        save.deposit();// from parent
        save.takeProfit();// come from saving
    }

}
class SuperSavings extends Saving{
    void SuperSavings(){
        System.out.println("super saving methods from super saving class");
        SuperSavings sp=new SuperSavings();
        sp.accountNumber=78882222;
        sp.money=10;
        sp.profit=90;
        sp.deposit();
        
    }

}