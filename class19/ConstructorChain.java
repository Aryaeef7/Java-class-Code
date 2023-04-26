package class19;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("I am non argument constructor");

    }
    ConstructorChain(String str){
        this();
        System.out.println(str);

    }
    ConstructorChain(int number){
        this("hello");
        System.out.println("This is constructor with in parameter");
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain(10);
    }

}
