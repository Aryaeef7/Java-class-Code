package class29;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Anush");
        names.add("Mnush");
        names.add("Knush");
        names.add("Pnush");
        names.add("Dnush");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Anush"));
        System.out.println(names.size());
        System.out.println(names);
    }

}
