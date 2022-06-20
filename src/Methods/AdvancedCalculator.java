package Methods;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        String menu = """
                1- Summation
                2- Subtraction
                3- Multiplication
                4- Dividing
                5- Exponentiation
                6- Factorial
                7- Modding
                8- Rectangle Area and Perimeter
                0- Log out""";

        System.out.println(menu);

        while (true) {

            System.out.print("Please select option you want to do: ");
            int select = calculator.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("Enter first number: ");
            int a = calculator.nextInt();
            System.out.print("Enter second number: ");
            int b = calculator.nextInt();

            switch (select) {
                case 1 -> plus(a, b);
                case 2 -> minus(a, b);
                case 3 -> times(a, b);
                case 4 -> divided(a, b);
                case 5 -> power(a, b);
                case 6 -> factorial();
                case 7 -> mod(a, b);
                case 8 -> rectangle(a, b);
                default -> System.out.println("Wrong value, please try again!");
            }

        }
        System.out.println("Logout!!!");
    }
    public static void plus(int a, int b){
        int result = a + b;
        System.out.println("Summation Result: " + result);
    }
    public static void minus(int a, int b){
        int result = a - b;
        System.out.println("Subtraction Result: " + result);
    }
    public static void times(int a, int b){
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }
    public static void divided(int a, int b){
        if (b == 0){
            System.out.println("Second number must be different from Zero!");
        }
        int result = a / b;
        System.out.println("Dividing Result: " + result);
    }
    public static void power(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        System.out.println("Exponentiation Result: " + result);
    }
    public static void mod(int a, int b){
        int result = a % b;
        System.out.println("Modding Result: " + result);
    }

    public static void rectangle(int a, int b){
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Rectangle's Area: " + area);
        System.out.println("Rectangle's Perimeter: " + perimeter);
    }

    public static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int a = scan.nextInt();
        int result = 1;
        for (int i=1; i <= a; i++)
            result *= i;
        System.out.println("Factorial: " + result);
    }

}