package Loops;

import java.util.Scanner;

public class GcdLcm2 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = number.nextInt();
        System.out.print("Enter second number: ");
        int number2 = number.nextInt();
        int Lcm=1, Gcd;


        while(Lcm<=(number1*number2)){
            if (Lcm % number1 == 0 && Lcm % number2 == 0){
                System.out.println("Least Common Multiple: " + Lcm);
                break;
            }
            Lcm++;
        }

        if (number1<number2){
            Gcd = number1;
            while (Gcd >=1) {
                if (number1 % Gcd == 0 && number2 % Gcd == 0){
                    System.out.println("Greatest Common Divisor: " + Gcd);
                    break;
                }
                Gcd--;
            }
        }else if (number2<number1){
            Gcd = number2;
            while (Gcd >=1) {
                if (number1 % Gcd == 0 && number2 % Gcd == 0){
                    System.out.println("Greatest Common Divisor: " + Gcd);
                    break;
                }
                Gcd--;
            }
        }else {
            System.out.println("The numbers you entered are equal to each other.");
            System.out.println("Greatest Common Divisor: " + number1);

        }
    }
}
