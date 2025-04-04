
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test{
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(5);
        num.add(15);
        num.add(12);

        List<Integer> evenNum =num.stream()
                                  .filter(n -> n% 2==0)
                                  .collect(Collectors.toList());

        System.out.println("even NUMBERS: "+ evenNum);                          
    }
}