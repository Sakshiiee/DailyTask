//using method

class Util {
    public static <T> void print(T item) {
        System.out.println(item);
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Util.print("abc");
        Util.print(123);
        Util.print(3.14);
    }
}
