package Loops;

import java.util.Scanner;

public class SumOddNumbers {

    // Sum of Odd Numbers

    public static void main(String[] args) {

        int no, total = 0;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter number: ");
            no = input.nextInt();

            if (no % 2 == 1){
                total += no;
            }

        }while (no > 0);

        System.out.println("Sum of odd numbers: " + total);
    }
}
