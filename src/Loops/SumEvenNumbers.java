package Loops;

import java.util.Scanner;

public class SumEvenNumbers {

    // Sum of multiples of 4

    public static void main(String[] args) {

        int no, total = 0;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Enter number: ");
            no = input.nextInt();

            if (no % 4 == 0){
                total += no;
            }

        }while (no % 2 == 0);

        System.out.println("Sum of even numbers divisible by 4: " + total);
    }
}
