package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from parent class");
    }
}
class SubClass extends SuperClass{
    SubClass(){
        super();// make a cll to the p. cons
        System.out.println("I am a child constructor");
    }

}