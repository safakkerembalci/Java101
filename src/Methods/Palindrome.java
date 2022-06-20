package Methods;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1991));

    }

    static boolean isPalindrome(int number) {

        int temp = number, reverseNumber = 0, lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        return reverseNumber == number;
    }
}
