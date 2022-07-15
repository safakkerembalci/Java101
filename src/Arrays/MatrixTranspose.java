package Arrays;

import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Row Number: ");
        int row = scan.nextInt();

        System.out.print("Enter Column Number: ");
        int column = scan.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[0].length; column++) {
                System.out.print("Enter matrix["+row+"]["+column+"]: ");
                matrix[row][column] = scan.nextInt();
            }
        }
        for (int i= 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix: ");
        for (int i= 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("Transpose of Matrix: ");
        for (int i= 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println(" ");
        }
    }
}
