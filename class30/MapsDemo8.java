package class30;

import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");

        var values=countries.values();
        for(var value:values){
            System.out.println(value);
        }
        var iterator=countries.values().iterator();
        while (iterator.hasNext());
        System.out.println(values);


    }
}
