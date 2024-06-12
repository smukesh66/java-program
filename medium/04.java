import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Case = ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("String = ");
                String str = scanner.next();
                if (isPalindrome(str))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;
            case 2:
                System.out.print("Number = ");
                int num = scanner.nextInt();
                if (isPalindrome(num))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
