package Variables;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        double pi=3.14, r;
        int angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = input.nextDouble();

        System.out.print("Enter the measure of the center angle: ");
        angle = input.nextInt();

        double perimeter = 2*pi*r, area=pi*Math.pow(r, 2), sliceArea = (pi*Math.pow(r, 2)*angle)/360;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Slice area of the circle: " + sliceArea);

    }
}
