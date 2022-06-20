package Variables;

import java.util.Scanner;

public class GpaCalculation {

    public static void main(String[] args) {

        int math, physics, chemistry, grammar, history, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");

        math = input.nextInt();

        System.out.print("Pyhsics Grade: ");

        physics = input.nextInt();

        System.out.print("Chemistry Grade: ");

        chemistry = input.nextInt();

        System.out.print("Grammar Grade: ");

        grammar = input.nextInt();

        System.out.print("History Grade: ");

        history = input.nextInt();

        System.out.print("Music Grade: ");

        music = input.nextInt();

        int total = (math + physics + chemistry + grammar + history + music);
        double average = (total/6.0);

        System.out.println(total);
        System.out.println(average);

        boolean condition1 = average >= 60;
        boolean condition2 = average < 60;

        String result = condition1 ? "Pass The Class": "Fail The Class";

        System.out.println(result);

    }
}