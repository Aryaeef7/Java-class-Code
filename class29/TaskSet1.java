package class29;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();
        country.add("USA");
        country.add("France");
        country.add("Italy");
        country.add("Spain");
        country.add("Portugal");

        System.out.println(country);

        for(String s:country){
            System.out.print(s+" ");
        }
    }
}
