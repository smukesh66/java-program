import java.util.Scanner;

public class Main {
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        String binary = scanner.nextLine();

        int decimal = binaryToDecimal(binary);
        String octal = binaryToOctal(binary);

        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + octal);
    }
}
