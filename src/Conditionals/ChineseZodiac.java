package Conditionals;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        int yearBirth;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year of birth: ");
        yearBirth = input.nextInt();

        yearBirth %= 12;

        if (yearBirth==0) {
            System.out.println("Your Chinese Zodiac: Monkey");
        }else if (yearBirth==1){
            System.out.println("Your Chinese Zodiac: Cockerel");
        }else if (yearBirth==2){
            System.out.println("Your Chinese Zodiac: Dog");
        }else if (yearBirth==3){
            System.out.println("Your Chinese Zodiac: Pig");
        }else if (yearBirth==4){
            System.out.println("Your Chinese Zodiac: Mouse");
        }else if (yearBirth==5){
            System.out.println("Your Chinese Zodiac: Ox");
        }else if (yearBirth==6){
            System.out.println("Your Chinese Zodiac: Tiger");
        }else if (yearBirth==7){
            System.out.println("Your Chinese Zodiac: Rabbit");
        }else if (yearBirth==8){
            System.out.println("Your Chinese Zodiac: Dragon");
        }else if (yearBirth==9){
            System.out.println("Your Chinese Zodiac: Snake");
        }else if (yearBirth==10){
            System.out.println("Your Chinese Zodiac: Horse");
        }else if (yearBirth==11){
            System.out.println("Your Chinese Zodiac: Sheep");
        }else {
            System.out.println("Wrong data, try again");
        }
    }
}
