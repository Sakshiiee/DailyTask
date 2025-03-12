
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String args[]) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(6);
        hs.add(1);
        hs.add(5);
        hs.add(8);

        List<Integer> filter = hs.stream()
                                 .filter(n -> n % 2 == 0)
                                 .map(n -> n * n * n) 
                                 .sorted()
                                 .collect(Collectors.toList());

        System.out.println("Filtered: " + filter);
       
    }
}



// import java.util.HashSet;
// import java.util.List;
// import java.util.stream.Collectors;

// public class StreamDemo2 {
//     public static void main(String args[]) {

//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(2);
//         hs.add(6);
//         hs.add(1);
//         hs.add(5);
//         hs.add(8);

//         System.out.println("All numbers: " + hs);

//         List<Integer> filterEven = hs.stream()
//                                      .filter(n -> n % 2 == 0) 
//                                      .sorted() 
//                                      .collect(Collectors.toList());

//         System.out.println("Even Numbers: " + filterEven);

//         List<Integer> sortedCube = filterEven.stream() 
//                                             // .map(n -> n * n * n) 
//                   
//                                             .collect(Collectors.toList());

//         System.out.println("Sorted Numbers Cubes: " + sortedCube);
//     }
// }
