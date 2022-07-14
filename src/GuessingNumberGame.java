import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        // int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5){
            System.out.print("Please enter your guess number: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Number must be between 0 and 100!");
                if (!isWrong){
                    isWrong = true;
                    System.out.println("If you enter incorrectly again, you will be deducted from your rights.");
                }else {
                    right++;
                    System.out.println("You have entered too many incorrect entries. Remaining right: " + (5-right));
                }
                continue;
            }
            if (selected == number){
                System.out.println("Congratulations correct number is: " + number);
                isWin = true;
                break;
            }else {
                System.out.println("Entered false number!");
                if(selected > number){
                    System.out.println(selected + " is bigger than secret number!");
                }else {
                    System.out.println(selected + " is smaller than secret number!");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Remaining right is " + (5-right));
            }
        }
        if (!isWin){
            System.out.println("You lost!");
            if (!isWrong){
                System.out.println("Your guessing numbers: " + Arrays.toString(wrong));
            }
        }
    }
}
