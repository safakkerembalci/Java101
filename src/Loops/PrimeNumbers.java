package Loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        for (int i=2; i<n; i++){
            int counter = 0;
            for (int k = 1; k<=i; k++){
                if (i % k == 0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.println(i + " ");
            }
        }
    }
}
