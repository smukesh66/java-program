import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
            i += 6;
        }
        return true;
    }

  
 public static int[] countPrimeComposite(int[] numbers) {
        int primeCount = 0;
        int compositeCount = 0;
        for (int num : numbers) {
            if (isPrime(num)) primeCount++;
            else compositeCount++;
        }
        return new int[]{primeCount, compositeCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
