import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        
        System.out.println(randomSupplier.get());  
    }
}
