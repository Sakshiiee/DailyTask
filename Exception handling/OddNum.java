public class OddNum {
    
    public static void EvenOdd(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }

    public static void main(String[] args) {
        try {
            EvenOdd(5);  
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try {
            EvenOdd(8); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
