package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USa";

        switch (country.toLowerCase()){

            case "usa":
                System.out.println("Burger");
                break;
            case "Itlay" :
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("wrong Country");



        }
    }
}
