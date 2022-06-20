package Loops;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = number.nextInt();
        System.out.print("Enter second number: ");
        int number2 = number.nextInt();
        int Lcm, Gcd;

        for (Lcm =1; Lcm<= (number1*number2); Lcm++){
            if (Lcm % number1 == 0 && Lcm % number2 == 0){
                System.out.println("Least Common Multiple: " + Lcm);
                break;
            }
        }

        if (number1<number2){
            for (Gcd = number1; Gcd >=1; Gcd--) {
                if (number1 % Gcd == 0 && number2 % Gcd == 0){
                    System.out.println("Greatest Common Divisor: " + Gcd);
                    break;
                }
            }
        }else if (number2<number1){
            for (Gcd = number2; Gcd >=1; Gcd--) {
                if (number1 % Gcd == 0 && number2 % Gcd == 0){
                    System.out.println("Greatest Common Divisor: " + Gcd);
                    break;
                }
            }
        }else {
            System.out.println("The numbers you entered are equal to each other.");
            System.out.println("Greatest Common Divisor: " + number1);
        }

        /*
        Lcm = (number1*number2)/Gcd;
        System.out.println("Least Common Multiple: " + Lcm);
         */

    }
}
