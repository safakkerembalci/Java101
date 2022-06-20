package Loops;

import java.util.Scanner;

public class DiamondWithStar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter number of digits: ");
        int digit = input.nextInt();

        /*
        digit = number of lines.
        k value = number of blank before stars
        j value = number of stars
         */

        for (int i = 1; i <= digit; i++){
            for (int k = 1; k<= (digit-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=digit-1; i>=1; i--) {
            for (int k = 1; k<=digit-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        int i=1;

        while (i <= digit){
            int k = 1;
            while (k <= (digit-i)) {

                System.out.print(" ");

                k++;
            }
            int j = 1;
            while (j <= (2*i)-1) {

                System.out.print("*");

                j++;
            }
            i++;
            System.out.println();
        }
         */

    }
}
