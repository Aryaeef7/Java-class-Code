package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        // it does not work in java 9 and below
        var name="kdbsfnjksdf";
        var c='s';
        var f=12.5;

        /*
        // works for java 6 till 19
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
         */

        words.removeIf(s -> s.endsWith("a"));// does not work in java 7
        System.out.println(words);
    }
}
