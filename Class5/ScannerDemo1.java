package Class5;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);


       /* System.out.println("please Enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");

        System.out.println("please Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight+" kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/
        System.out.println("please Enter name");
        String name=scan.next();
        System.out.println("your name is"+name);
    }
}
