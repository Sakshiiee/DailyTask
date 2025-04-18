import java.util.ArrayList;
import java.util.List;

public class kidsCandy{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        
        // Find the maximum candies any kid currently has
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }
        
        // Check if each kid can have the greatest candies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandy);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(kidsWithCandies(candies1, extraCandies1));

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(kidsWithCandies(candies2, extraCandies2));

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(kidsWithCandies(candies3, extraCandies3));
    }
}
