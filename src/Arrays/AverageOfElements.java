package Arrays;

public class AverageOfElements {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6};

        double total = 0;
        double average;

        for (int i : list) {

            total += i;

        }

        System.out.println("Summation of List: " + total);
        average = total / list.length;
        System.out.println("Average of Elements in Array: " + average);

    }
}
