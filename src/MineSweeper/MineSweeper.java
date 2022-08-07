package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;
    String [][] map;
    String [][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);


    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new String[row][column];
        this.board = new String[row][column];
    }
/*
    public void prepareGame(){

        int numberMine = (row * column)/4;
        int count = 0;
        while(count != numberMine){
            int randRow = rand.nextInt(row);
            int randColumn = rand.nextInt(column);
            if (map[randRow][randColumn] != " * "){
                map[randRow][randColumn] = " * ";
                count++;
            }
        }
    }

    public void print (String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

 */
    public void locationOfMines(){

        int numberMine = (this.row * this.column)/4;

        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                this.map [i][j] = " - ";
            }
        }

        // Alttaki while döngüsünün alternatifir.
       // for (int i = 0; i < numberMine; i++) {
        //    int randRow = rand.nextInt(row);
        //    int randColumn = rand.nextInt(column);

       //     if (map[randRow][randColumn] == " * ") i--;
      //      else map[randRow][randColumn] = " * ";
  //      }

        int count = 0;
        while(count != numberMine){
            int randRow = rand.nextInt(row);
            int randColumn = rand.nextInt(column);
            if (map[randRow][randColumn] != " * "){
                map[randRow][randColumn] = " * ";
                count++;
            }
        }

        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                System.out.print(this.map[i][j]);
            }
            System.out.println();
        }
    }

    public void creatingBoard(){
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board [i][j] = " - ";
            }
        }
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j]);
            }
            System.out.println();
        }
    }


    public void run (){

        int success=0;

        System.out.println("Location of Mines: ");
        //prepareGame();

        locationOfMines();
        //print(map);

        System.out.println("Welcome Minesweeper!");

        creatingBoard();
        //print(board);

        while(game){

            System.out.print("Enter the row: ");
            int rowNumber = input.nextInt();
            System.out.print("Enter the column: ");
            int colNumber = input.nextInt();

            if(rowNumber < 0  || rowNumber >= row){
                System.out.println("Invalid Coordinate!");
                continue;
            }
            if(colNumber < 0  || colNumber >= column){
                System.out.println("Invalid Coordinate!");
                continue;
            }

            if(map[rowNumber][colNumber] != " * "){
                checkMine(rowNumber, colNumber);
                success ++;
                int numberMine = (this.row * this.column)/4;
                if(success == ((this.row*this.column)-numberMine)){
                    System.out.println("All mines cleared, You win!");
                    break;
                }
            }else {
                this.game = false;
                System.out.println("You stepped on a mine, Game Over!");
            }
        }
    }

    public void checkMine(int r, int c){
        int count = 0;
        if(this.map[r][c] == " - "){
            if ((c < this.column-1) && (this.map[r][c+1] == " * ")){
                count++;
            }
            if ((r < this.row-1) && (this.map[r+1][c] == " * ")){
                count++;
            }
            if ((c > 0) && (this.map[r][c-1] == " * ")){
                count++;
            }
            if ((r > 0) && (this.map[r-1][c] == " * ")){
                count++;
            }
            if ((c > 0 && r > 0) && (this.map[r-1][c-1] == " * ")){
                count++;
            }
            if ((r < this.row-1 && c < this.column-1) && (this.map[r+1][c+1] == " * ")){
                count++;
            }
            if ((r > 0 && c < this.column-1) && (this.map[r-1][c+1] == " * ")){
                count++;
            }
            if ((c > 0 && r < this.row-1) && (this.map[r+1][c-1] == " * ")){
                count++;
            }

            String s = String.valueOf(count);
            this.board[r][c] = " "+s+" ";

            if(this.board[r][c] == " - "){
                this.board[r][c] = " n ";
            }

            for (int i = 0; i < this.board.length; i++) {
                for (int j = 0; j < this.board[i].length; j++) {
                    System.out.print(this.board[i][j]);
                }
                System.out.println();
            }
        }
    }
}



