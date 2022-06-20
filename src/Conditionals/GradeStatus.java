package Conditionals;

import java.util.Scanner;

public class GradeStatus {
    public static void main(String[] args) {

        double math, physics, chemistry, grammar, music, total=0, lesson=0;

        Scanner input = new Scanner(System.in);

        System.out.print("enter math grade: ");
        math = input.nextDouble();

        if (math <0 || math>100) {
            System.out.println("math grade not taken into consideration");
        }else
            total += math; lesson +=1;

        System.out.print("enter physics grade: ");
        physics = input.nextDouble();

        if (physics <0 || physics>100) {
            System.out.println("physics grade not taken into consideration");
        }else
            total += physics; lesson +=1;

        System.out.print("enter chemistry grade: ");
        chemistry = input.nextDouble();

        if (chemistry <0 || chemistry>100) {
            System.out.println("chemistry grade not taken into consideration");
        }else
            total += chemistry; lesson +=1;

        System.out.print("enter grammar grade: ");
        grammar = input.nextDouble();

        if (grammar <0 || grammar>100) {
            System.out.println("grammar grade not taken into consideration");
        }else
            total += grammar; lesson +=1;

        System.out.print("enter music grade: ");
        music = input.nextDouble();

        if (music <0 || music>100) {
            System.out.println("music grade not taken into consideration");
        }else
            total += music; lesson +=1;

        double average = total/lesson;

        if (average <= 55){
            System.out.println("failed the class");

        }else {
            System.out.println("congrats, pass the class");
        }

        System.out.println("your average grade: " + average);

    }
}