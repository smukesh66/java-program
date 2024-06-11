import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. N should be a positive integer.");
            return;
        }

        System.out.print("First " + n + " perfect numbers are: ");
        int count = 0;
        for (int i = 1; ; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == n) {
                break;
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
