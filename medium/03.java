import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[denominations.length];
        
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            notes[i] = scanner.nextInt();
        }
        
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalAmount += denominations[i] * notes[i];
        }
        
        System.out.println("Total amount available in ATM: " + totalAmount);
    }
}
