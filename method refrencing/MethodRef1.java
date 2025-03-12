//static method refrence

import java.util.function.Function;

class MethodRef1 {
    public static int sq(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> a = MethodRef1::sq;  
        System.out.println(a.apply(8));
    }
}
