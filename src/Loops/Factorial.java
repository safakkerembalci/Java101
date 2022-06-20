package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // n! = 1 * 2 * 3 * 4 * ... * number

        Scanner input = new Scanner(System.in);
        System.out.print("enter factorial number: ");
        int number = input.nextInt();
        int total = 1, i = 1;

        /*
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
         */

        while (i <= number) {
            total *= i;
            i++;
        }

        System.out.println(number + " Factorial: " + total);

    }
}

