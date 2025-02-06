import java.util.Arrays;

public class maxTripProduct {
    public static int maxProduct(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            throw new IllegalArgumentException("Array should have at least 3 elements");
        }
        Arrays.sort(arr);
        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int option2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 3, 5, 6, 20};
        System.out.println("Maximum Product: " + maxProduct(arr1)); // Output: 1200

        int[] arr2 = {-10, -3, -5, -6, -20};
        System.out.println("Maximum Product: " + maxProduct(arr2)); // Output: -90

        int[] arr3 = {1, -4, 3, -6, 7, 0};
        System.out.println("Maximum Product: " + maxProduct(arr3)); // Output: 168
    }
}
