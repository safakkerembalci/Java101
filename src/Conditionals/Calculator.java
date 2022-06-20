package Conditionals;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        n2 = input.nextDouble();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Make your choice: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.print("Addition: " + (n1+n2));
                break;

            case 2:
                System.out.print("Subtraction: " + (n1-n2));
                break;

            case 3:
                System.out.print("Multiplication: " + (n1*n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.print("Division: " + (n1 / n2));
                }else System.out.print("No number can be divided by zero");
                break;

            default:
                System.out.print("Wrong number, try again please");
                break;
        }
    }
}
