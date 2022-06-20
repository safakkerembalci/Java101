package Variables;

import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {

        double pear, apple, tomato, banana, eggplant,
                kgPear = 2.14, kgApple = 3.67, kgTomato = 1.11, kgBanana = 0.95, kgEggplant = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Specify the amount of pears in kg: ");
        pear = inp.nextDouble();

        System.out.print("Specify the amount of apples in kg: ");
        apple = inp.nextDouble();

        System.out.print("Specify the amount of tomatoes in kg: ");
        tomato = inp.nextDouble();

        System.out.print("Specify the amount of bananas in kg: ");
        banana = inp.nextDouble();

        System.out.print("Specify the amount of eggplants in kg: ");
        eggplant = inp.nextDouble();

        double totPear=pear*kgPear, totApple=apple*kgApple, totTomato=tomato*kgTomato, totBanana=banana*kgBanana, totEggplant=eggplant*kgEggplant,
                Total=totPear+totTomato+totApple+totBanana+totEggplant;

        System.out.println("Pear Amount: " + totPear + " usd");
        System.out.println("Apple Amount: " + totApple + " usd");
        System.out.println("Tomato Amount: " + totTomato + " usd");
        System.out.println("Banana Amount: " + totBanana + " usd");
        System.out.println("Eggplant Amount: " + totEggplant + " usd");
        System.out.println("Total Amount: " + Total + " usd");

    }
}
