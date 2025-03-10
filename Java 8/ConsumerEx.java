import java.util.function.Consumer;

public class ConsumerEx{
    public static void main(String[] args) {
        Consumer<String> printMsg = msg -> System.out.println("Message is here: " + msg);
        
        printMsg.accept("Hello");  
    }
}
