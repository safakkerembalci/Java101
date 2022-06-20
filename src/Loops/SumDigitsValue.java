package Loops;

import java.util.Scanner;

public class SumDigitsValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int result = 0;
        int digitValue;
        int digit=0;
        int tempNumber = number;

        //You can find number of digit.

        while (tempNumber != 0){
            tempNumber /= 10;
            digit++;
        }

        tempNumber = number;

        //You can find value of each digit and get the sum.

        while (tempNumber != 0){
            digitValue = tempNumber % 10;
            result += digitValue;
            tempNumber /=10;
        }

        System.out.println("Sum of digits value: " + result);

    }
}
