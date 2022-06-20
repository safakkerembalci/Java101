package Loops;

import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {

        // for sample

        int no;

        Scanner input = new Scanner(System.in);

        System.out.print("enter number: ");
        no = input.nextInt();

        for (int i = 1; i <= no; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
    }
}
