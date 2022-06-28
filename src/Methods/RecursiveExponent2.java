package Methods;

import java.util.Scanner;

public class RecursiveExponent2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base value: ");
        int base = input.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = input.nextInt();

        System.out.println("Result: " + power(base, exponent));
    }

    public static int power(int base, int exponent){

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
