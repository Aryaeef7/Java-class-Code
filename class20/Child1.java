package class20;

import java.sql.SQLOutput;

public class Child1 extends  Parent{
    public static void main(String [] args){
        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();//accessing static method
        Child1.bye();//accessing static method from the parent class

       // c1.money(); private access

        c1.name="Fayed";
        Child1.lastName="Aryaee";

    }



}
