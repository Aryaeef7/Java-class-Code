package class16;

public class Task5 {
    //Write a method to return whether given number is prime or not?
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

     public static void main(String[] args) {
         Task5 task5Prime = new Task5();
         System.out.println("Is given number prime ? " + task5Prime.isPrime(5));


     }
    }






