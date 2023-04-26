package class16;

import class3.Task4;

public class task4 {
    /*  4)Create a method that will say Hello
    in different language based on the country
    that will passed when method is executed.
    */
        // return type => String void
        // name =syHello
        //parameter=> String countryName
    String sayHello(String countryName) {

        switch (countryName) {

            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        //System.out.println(task4.sayHello);
    }


}


