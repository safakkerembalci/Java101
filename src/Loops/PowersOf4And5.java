package Loops;

import java.util.Scanner;

public class PowersOf4And5 {
    public static void main(String[] args) {

        int no;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        no = input.nextInt();

        System.out.println("4's exponents");

        for (int i = 1; i <= no; i*=4) {

            System.out.println(i);
        }

        System.out.println("5's exponents");

        for (int i = 1; i <= no; i*=5) {

            System.out.println(i);
        }

    }
}
