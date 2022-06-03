package MinMaxNorm;
import java.util.Scanner;

public class MinMaxNorm {
    public static double[] minMaxNormalization (double [] inputData) {
        double M = inputData[0];
        double m = inputData[0];
        
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] > M)
                M = inputData[i];

            if (inputData[i] < m)
                m = inputData[i];
        }

        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = (inputData[i] - m) / (M - m);
        }

        return inputData;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double vector[] = new double[10];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < 10; i++) {
            vector[i] = scanner.nextInt();
        }

        vector = minMaxNormalization(vector);

        System.out.println("Normalized: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }
}