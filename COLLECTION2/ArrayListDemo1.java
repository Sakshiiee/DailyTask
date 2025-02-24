
import java.util.ArrayList;

public class ArrayListDemo1{

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(0);
        ar.add(1);
        ar.add("sakshi");
        ar.add(1);              // //duplicates are allowed
        ar.add(null);         //null is allowed

        //first way of iteration
        System.out.println(ar);

    }
    
    
}