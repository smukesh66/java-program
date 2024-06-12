import java.util.Scanner;

public class Main {
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        int decimal = scanner.nextInt();

        String binary = decimalToBinary(decimal);
        String octal = decimalToOctal(decimal);

        System.out.println("Binary Number = " + binary);
        System.out.println("Octal = " + octal);
    }
}
