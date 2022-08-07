package MineSweeper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println("Welcome to Minesweeper!");
            System.out.println("Please enter the table sizes you want to play.");

            Scanner scan = new Scanner(System.in);
            System.out.print("Number of row: ");
            int row = scan.nextInt();
            System.out.print("Number of column: ");
            int column = scan.nextInt();

            if(row < 0 || column < 0){
                System.out.println("Invalid Coordinate!, Please try again.");
            }

            MineSweeper mine = new MineSweeper(row, column);

            mine.run();
    }
}
