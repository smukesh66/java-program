import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {14, 67, 48, 23, 5, 62};

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n <= 0 || n > numbers.length) {
            System.out.println("Invalid input for N.");
            return;
        }

        Arrays.sort(numbers);

        System.out.println(n + "th Largest number: " + numbers[numbers.length - n]);
    }
}
