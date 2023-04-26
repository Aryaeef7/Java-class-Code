package class24;

public abstract class Animal {
    /* define the speak eat method and create 3 subclasses and override the speak and
    eat method */
    void eat(){
        System.out.println("Animal can eat");
    }
    abstract void speak();

    }

class Dog extends Animal {
    void eat() {
        System.out.println("Dog can eat");
    }

    void speak() {
        System.out.println("Dog can bark");
    }
}
class Cat extends Animal{
    void eat() {
        System.out.println("cat can eat");
    }

    void speak() {
        System.out.println("Mew mew");
    }
}