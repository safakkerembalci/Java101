package Arrays;

import java.util.Arrays;

public class RepeatingEvenNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] list = {5, 9, 2, 74, 9, 95, 2, 26, 51, 4, 26, 3, 92, 3, 74};
        int [] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ( (i != j) && (list[i] == list[j])){
                    if (!isFind(duplicate, list[i]) && list[i] % 2 == 0){
                        duplicate [startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(duplicate));
    }
}

