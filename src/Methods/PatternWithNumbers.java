package Methods;

import java.util.Scanner;

public class PatternWithNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        positive(negative(number), number);

    }

    public static int negative(int number){
        if (number <= 0){
            return number;
        } else {
            System.out.print(number + " ");
            return negative(number-5);
        }
    }

    public static int positive(int newNumber, int number){
        if (newNumber > number){
            return number;
        } else {
            System.out.print(newNumber + " ");
            return positive(newNumber+5, number);
        }
    }
}