import java.util.*;

public class signRearrange {
    public static void rearrangeArray(int[] arr) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        int i = 0, pos = 0, neg = 0;
        
        // Merge positive and negative numbers alternately
        while (pos < positive.size() && neg < negative.size()) {
            arr[i++] = positive.get(pos++);
            arr[i++] = negative.get(neg++);
        }
        
        // Add remaining positive numbers
        while (pos < positive.size()) {
            arr[i++] = positive.get(pos++);
        }
        
        // Add remaining negative numbers
        while (neg < negative.size()) {
            arr[i++] = negative.get(neg++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrangeArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
