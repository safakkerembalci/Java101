package Loops;

import java.util.Scanner;

public class FindEvenNumbers2 {
    public static void main(String[] args) {

        // while and do-while sample

        int no;

        Scanner input = new Scanner(System.in);

        System.out.print("enter number: ");
        no = input.nextInt();

        int i=1;

        /*
        while (i <= no) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
         */

        do {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }while (i <= no);
    }
}
