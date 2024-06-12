import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0;
        double positiveSum = 0, negativeSum = 0;
        int num;

        while (true) {
            System.out.println("Enter the number (-1 to exit): ");
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
        }

        if (positiveCount > 0) {
            double positiveAverage = positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        if (negativeCount > 0) {
            double negativeAverage = negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers were entered.");
        }
    }
}
