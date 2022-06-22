package Methods;

import java.util.Scanner;

public class RecursivePrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        if(isPrime(number,2)){
            System.out.println(number + " is a PRIME number.");
        }
        else{
            System.out.println(number + " is not a PRIME number.");
        }
    }

    static boolean isPrime(int n,int m) {
        if(n <= 2){
            return n == 2;
        }
        if(m == n){
            return true;
        }
        if(n % m == 0){
            return false;
        }
        return isPrime(n,m+1);
    }
}