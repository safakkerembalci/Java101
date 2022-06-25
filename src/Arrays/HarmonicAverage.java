package Arrays;

public class HarmonicAverage {

    public static void main(String[] args) {

        double [] list = {1, 2, 3, 4, 5};

        double total = 0.0;
        double harmonicAverage;

        for (double i : list) {

            total += (1 / i);
            System.out.print(1 / i + " ");
        }

        harmonicAverage = list.length / total;
        System.out.println();
        System.out.println("Harmonic Average: " + harmonicAverage);

    }
}
