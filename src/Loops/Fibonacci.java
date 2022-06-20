package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want it to be an array? : ");
        int element = input.nextInt();
        int total;
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i=0; i<=element; i++){
            total = firstNumber + secondNumber;
            System.out.print(firstNumber + " ");
            firstNumber = secondNumber;
            secondNumber = total;

        }
    }
}
