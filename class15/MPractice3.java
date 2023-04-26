package class15;

public class MPractice3 {
    /*
    create a method that take of an array of int sum all the elements from the array
    and return the sum.
     */

    int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
      return sum;
    }
}