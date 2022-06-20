package Loops;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();

        int biggestNumber=0;
        int smallestNumber=0;

        int i = 1;
        while (i<=n){
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number>biggestNumber){
                biggestNumber = number;
            }else if (number<smallestNumber){
                smallestNumber = number;
            }
            i++;
        }
        System.out.println("The biggest number: " + biggestNumber);
        System.out.println("The smallest number: " + smallestNumber);
    }
}
