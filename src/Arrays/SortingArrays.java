package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the array: ");
        int numberOfElements = sc.nextInt();

        int [] arr = new int[numberOfElements];

        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print((i+1) + ". element: " );
            int element = sc.nextInt();
            arr [i] = element;
        }

        Arrays.sort(arr);

        System.out.print("Arrangement: ");

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
