package Methods;
import java.util.Scanner;
public class RecursiveExponent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = input.nextInt();
        System.out.print("Enter exponent value: ");
        int exponent = input.nextInt();

        int result = pow(base, exponent);
        System.out.println("Result: " + result);
    }
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * pow(base, exponent - 1);
        }
    }
}
