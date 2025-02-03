public class LeadersinArray {

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1]; 
        System.out.print(maxFromRight + " "); 
        
        // Traverse from secondlast element to the first if any 
        for (int i = n - 2; i >= 0; i--) { 
            if (arr[i] >= maxFromRight) { 
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " "); 
            }
        }
    }

    public static void main(String[] args) {
        // 1st case
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.print("Leaders in arr1: ");
        findLeaders(arr1);
        System.out.println(); 

        // 2nd case
        int[] arr2 = {1, 2, 3, 4, 5, 2};
        System.out.print("Leaders in arr2: ");
        findLeaders(arr2);
        System.out.println();
    }
}
