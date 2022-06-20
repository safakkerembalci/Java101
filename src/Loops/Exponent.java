package Loops;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {

        int n, k;

        Scanner input = new Scanner(System.in);

        System.out.print("enter number: ");
        n = input.nextInt();

        System.out.print("enter exponent: ");
        k= input.nextInt();

        int total = 1;

        for (int i = 1; i <= k; i++){
            total *= n;
        }

        /*
        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
         */

        System.out.println("Result :" + total);

    }
}
