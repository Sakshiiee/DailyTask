import java.util.function.Function;

public class FunDemo{
    public static void main(String[] args) {
        Function<String, Integer> strLength = str -> str.length();
        
        System.out.println(strLength.apply("Java 8"));  
    }
}
