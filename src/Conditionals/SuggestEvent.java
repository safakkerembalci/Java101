package Conditionals;

import java.util.Scanner;

public class SuggestEvent {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the heat: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("you can go skiing");

        } else if (heat <= 25) {
            if (heat < 15) {
                System.out.println("you can go to cinema");
            }
            if (heat > 10) {
                System.out.println("you can go to picnic");
            }
        }else {
            System.out.println("you can go swimming");
        }

    }
}
