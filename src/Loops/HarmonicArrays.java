package Loops;

import java.util.Scanner;

public class HarmonicArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        double result = 0;

        for (int i = 1; i<=n; i++) {

            result += (1.0/i);

        }

        System.out.println("harmonic result of array with " + n + " elements: " + result);

    }
}
