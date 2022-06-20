package Conditionals;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Make your choice: ");
        select = input.nextInt();

        if (select == 1){
            System.out.print("Addition: " + (n1+n2));

        } else if (select == 2) {
            System.out.print("Subtraction: " + (n1-n2));

        } else if (select == 3) {
            System.out.print("Multiplication: " + (n1*n2));

        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("Division: " + (n1/n2));
            }
            else {
                System.out.print("No number can be divided by zero");
            }

        }else {
            System.out.print("Wrong choice, try again");
        }
    }
}

