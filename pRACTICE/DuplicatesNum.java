
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
// import java.util.Collectors;

public class DuplicatesNum{

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,4,2,5,6,1,6,8,3,3,9,2,1,3);
      
        TreeSet<Integer> ts = new TreeSet<>();                          //unique
       TreeSet<Integer> duplicate = new TreeSet<>();                // duplicates

        // for(Integer num :li){
        //     if(!ts.add(num)){
        //         duplicate.add(num);

        //     }



        // }

        // TreeSet<Integer> duplicate = li.stream()
        //                                .filter(n -> !new TreeSet<>().add(n)) 
        //                                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Duplicate: "+ duplicate);

    }
        
    }

