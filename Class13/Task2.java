package Class13;

public class Task2 {
    public static void main(String[] args) {

        String dadsName = "Daniel";
        String momsName = "Mary";
        String expectation = "Boy";

        if (expectation.equalsIgnoreCase("boy")) {
            String firstHalf = dadsName.substring(0, dadsName.length() / 2);
        String secondHalf=momsName.substring(momsName.length()/2);
            System.out.println(firstHalf+secondHalf);

        }

    }
}
