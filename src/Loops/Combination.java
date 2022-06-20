package Loops;

import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {

        // C(n,r) = n! / r! * (n-r)!)

        Scanner input = new Scanner(System.in);
        System.out.print("enter factorial number: ");
        int n = input.nextInt();
        System.out.print("enter combination number: ");
        int r = input.nextInt();

        int totalN = 1, totalR = 1, totalNR =1;

        for (int i = 1; i <= n; i++) {

            totalN *= i;

        }

        for (int i = 1; i <= r; i++) {

            totalR *= i;

        }

        for (int i = 1; i <= (n-r); i++) {

            totalNR *= i;

        }

        int result = totalN / (totalR * totalNR);

        System.out.println( r + " combination of " + n + " = " + result);

    }
}
