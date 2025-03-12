import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25);

        Set<Integer> unique = new HashSet<>(numbers);
        
        List<Integer> sorted= new ArrayList<>(unique);
        Collections.sort(sorted, Collections.reverseOrder());

        if (sorted.size() < 2) {
            System.out.println("Not a second highest number");
        } else {
            System.out.println("Second Highest: " + sorted.get(1));
        } 
    }
}
