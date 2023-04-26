package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        while (scanner.next().equalsIgnoreCase("sha")){
            System.out.println("great student");
        }

    }
}
