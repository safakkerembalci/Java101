package Variables;

import java.util.Scanner;

public class VatAmount {

    public static void main(String[] args) {

        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");

        price = input.nextDouble();

        boolean condition1 = price > 1000;
        boolean condition2 = price <= 1000;

        double vatRate = condition1 ? 8: 18;
        double vat=price*vatRate/100, priceWithVat=vat+price;

        System.out.println("Price without VAT : " + price + " usd");
        System.out.println("VAT Rate : " + vatRate + " %" );
        System.out.println("VAT : " + vat + " usd");
        System.out.println("Price with VAT : " + priceWithVat + " usd");

    }
}
