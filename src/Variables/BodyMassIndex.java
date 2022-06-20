package Variables;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double height, weight;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        double bmi;
        bmi = weight / (height * height);

        System.out.println("Body Mass Index: " + bmi + " BMI");

    }
}