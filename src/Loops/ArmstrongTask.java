package Loops;

public class ArmstrongTask {

    public static void main(String[] args) {

        // Program that displays Armstrong numbers up to 1000.

        int limit = 9999;

        for (int number=1 ; number <= limit; number++){

            int tempNumber = number;
            int digit = 0;
            int digitValue;
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
            }
        }
    }
}
