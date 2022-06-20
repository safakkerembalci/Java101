package Loops;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int digit = 0;
        int digitValue;
        int tempNumber = number;
        int digitPow;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digit++;
        }

        tempNumber = number;

        while (tempNumber !=0){
            digitValue = tempNumber % 10;
            digitPow = 1;
            for (int i = 1; i <= digit; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNumber /=10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        }else System.out.println(number + " is not an Armstrong number");

    }
}
