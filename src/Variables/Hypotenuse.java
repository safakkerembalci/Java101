package Variables;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        double a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side a:");
        a = input.nextDouble();

        System.out.print("Enter the length of side b:");
        b = input.nextDouble();

        double hypotenuse = Math.sqrt((Math.pow(a, 2))+(Math.pow(b, 2))),
                area = (a*b)/2, perimeter = hypotenuse+a+b;

        System.out.println("Lenght of Hypotenuse:" + hypotenuse);
        System.out.println("Perimeter of Triangle:" + perimeter);
        System.out.println("Area of Triangle:" + area);

    }
}
