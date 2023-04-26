package class29;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(100);
        System.out.println(numbers);
    }
}
