package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestElements2 {

    public static void main(String[] args) {

        int [] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        int min = 0;

        for (int i : list){
            if (i<min){
                min = i;
            }
            if (i>max){
                max = i;
            }
        }

        for (int j : list) {
            if (j < max && j > n) {
                max = j;
            } else if (j > min && j < n) {
                min = j;
            }
        }

        System.out.println("The nearest number bigger than the entered number: " + max);
        System.out.println("The nearest number smaller than the entered number: " + min);
    }
}
