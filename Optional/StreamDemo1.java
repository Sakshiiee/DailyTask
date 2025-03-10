import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Pune");
        city.add("Mumbai");
        city.add("Parbhani");
        city.add("Nashik");
        city.add("Aurangabad");
        city.add("Amravati");

        List<String> filtered = city.stream()
                                    // .filter(name -> name.startsWith("A")) 
                                    .filter(Name -> Name.endsWith("i"))
                                    .sorted() 
                                    .collect(Collectors.toList());

        filtered.forEach(System.out::println); 
    }
}
