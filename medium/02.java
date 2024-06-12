import java.util.Arrays;

public class MNMaxMin {

    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;
        
        
        Arrays.sort(arr);
        
        // Find Mth maximum (Mth maximum in sorted array is (length-M)th element)
        int MthMax = arr[arr.length - M];
        
        
        int NthMin = arr[N - 1];
        
        
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;
        
        /
        System.out.println("Array of elements: " + Arrays.toString(arr));
        System.out.println("Mth maximum number (M=" + M + "): " + MthMax);
        System.out.println("Nth minimum number (N=" + N + "): " + NthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
