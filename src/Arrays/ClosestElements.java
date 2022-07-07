package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list ={15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.println("Enter number: " );
        int n = scanner.nextInt();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        for(int i : list){
            if(i< n){
                min = i;
            } else if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("The nearest number smaller than the entered number: " + min);
        System.out.println("The nearest number bigger than the entered number: " + max);
    }
}
