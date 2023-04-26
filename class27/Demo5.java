package class27;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('b');
        characters.add('c');
        characters.add('D');
        characters.add('E');

        for(Character c:characters){
            System.out.print(c+" ");
        }
    }

}
