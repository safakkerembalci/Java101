package Loops;

import java.util.Scanner;

public class DivisibleNumbers {

    public static void main(String[] args) {

        // Average of numbers divisible by 3 and 4

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = input.nextInt();

        int total=0, counter=0, average;

        for (int i=0; i<=number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {

                total += i;
                counter ++;
                System.out.println(i);
            }
        }

        average = total/counter;
        System.out.println("Average of numbers divisible by 3 and 4= " + average);
    }
}