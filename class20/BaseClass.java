package class20;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("Hello method from Base class");
    }
}
class Child extends BaseClass {

    String name="Jane";
    void callMe(){
        System.out.println(name);
    }

}