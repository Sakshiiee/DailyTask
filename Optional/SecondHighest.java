import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Double> num = Arrays.asList(1.2, 8.0, 3.8, 3.5, 9.5, 2.3,8.0, 9.5);

        Optional<Double> secondHighest = num.stream()
                                            .distinct() 
                                            .sorted(Comparator.reverseOrder()) 
                                            .skip(1) 
                                            .findFirst();

        // if (secondHighest.isPresent()) {
        //     System.out.println("Second Highest: " + secondHighest.get());
        // } else {
        //     System.out.println("No second highest number");
        // }
        secondHighest.ifPresent(n -> System.out.println("Second Highest: " + n));

    }
}
