import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0, lowercaseCount = 0, numberCount = 0;
        char ch;

        while (true) {
            System.out.println("Enter any character (* to exit): ");
            ch = scanner.next().charAt(0);

            if (ch == '*') {
                break;
            }

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        System.out.println("Total count of uppercase: " + uppercaseCount);
        System.out.println("Total count of lowercase: " + lowercaseCount);
        System.out.println("Total count of numbers: " + numberCount);
    }
}
