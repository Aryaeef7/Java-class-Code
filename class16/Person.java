package class16;

public class Person {
    private  double bankBalance=125000;
    String Address="Street 123";
    String name="Jon Snow";

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
    }
}
