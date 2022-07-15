package Arrays;

import java.util.Arrays;

public class FrequenciesOfElements {

    public static void main(String[] args) {

        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int counter;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    counter ++;
                }
            }
            if (i == 0 && arr[i+1]==arr[i]){
                System.out.println("Number "+arr[i] +" was repeated "+ counter);
            }
            if(i==0 && arr[i+1]!=arr[i])
            {
                System.out.println("Number "+arr[i] +" was repeated "+ counter);
            }

            if(i!=0 && arr[i-1]!=arr[i])
            {
                System.out.println("Number "+arr[i] +" was repeated "+ counter);
            }
        }
    }
}
