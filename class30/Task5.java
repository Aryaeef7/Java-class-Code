package class30;

import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
      /*Create a map of countries with its capital that will store countries
      in alphabetical order.print all keys and values from a country map using
      for each loop and iterator. print all values from a country map using
       for each loop and iterator*/
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");

       var entrySet=countries.entrySet();
       for (var entry:entrySet){ //var key is in Java 10
           System.out.println(entry.getKey()+"capital is: "+entry.getValue());

           var iterator=countries.entrySet().iterator();

           while (iterator.hasNext());

           //var entry=iterator.next();
           System.out.println(entry.getKey()+" "+ entry.getKey());
       }



    }
}
