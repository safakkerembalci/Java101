package Variables;

import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args) {

        double km, amount, perKm = 2.20, openingFee= 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();

        double total = (km * perKm);
        total += openingFee;

        total = (total < 20 )? 20: total;

        System.out.println("Opening Fee: " + openingFee + " usd");
        System.out.println("Total Amount: " + total + " usd");

    }
}
