package Loops;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter number of digits: ");
        int digit = input.nextInt();

        for (int i=digit; i>=1; i--) {
            for (int k = 1; k<=digit-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
