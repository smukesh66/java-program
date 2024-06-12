import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            int element = scanner.nextInt();
            if (!array.contains(element)) {
                array.add(element);
            }
        }
        
        System.out.println("Non-duplicate items:");
        System.out.println(array);
    }
}
