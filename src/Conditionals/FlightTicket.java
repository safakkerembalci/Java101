package Conditionals;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        int age;
        double distance;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the distance of flight: ");
        distance = input.nextDouble();

        System.out.println("1-Return\n2-One Way");
        System.out.print("Enter the type of flight: ");
        int flightType = input.nextInt();
        input.nextLine();

        double price = 0;

        switch (flightType) {
            case 1 -> {
                System.out.println("The Type of Flight: Return");
                distance = 2 * distance;
                if (distance >= 0) {

                    if (age < 12) {
                        price = (distance * 0.1) * (1 - 0.5) * (1 - 0.2);
                    } else if (age <= 24) {
                        price = (distance * 0.1) * (1 - 0.1) * (1 - 0.2);
                    } else if (age >= 65) {
                        price = (distance * 0.1) * (1 - 0.3) * (1 - 0.2);
                    } else {
                        price = (distance * 0.1) * (1 - 0.2);
                    }

                } else {
                    System.out.println("wrong distance, please try again");
                }
            }
            case 2 -> {
                System.out.println("The Type of Flight: One Way");
                if (distance >= 0) {

                    if (age < 12) {
                        price = (distance * 0.1) * (1 - 0.5);
                    } else if (age <= 24) {
                        price = (distance * 0.1) * (1 - 0.1);
                    } else if (age >= 65) {
                        price = (distance * 0.1) * (1 - 0.3);
                    } else {
                        price = (distance * 0.1);
                    }

                } else {
                    System.out.println("wrong distance, please try again");
                }
            }
            default -> System.out.println("Wrong data, try again");
        }

        System.out.println("Your Age: " + age);
        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Discounted Price: " + price + " usd");

    }
}
