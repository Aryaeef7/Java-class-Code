package class29;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {
  // hashset not allowed duplicate and there is no order sequences
        HashSet<String>fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.size();
        System.out.println(fruit);

    }
}
