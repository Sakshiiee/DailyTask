
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2{

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(0);
        ar.add(1);
        ar.add("sakshi");
        ar.add(1);              // //duplicates are allowed
        ar.add(null);         //null is allowed

        //first way of iteration
       // System.out.println(ar);

        //second way of iteration using iterator
        Iterator itr = ar.iterator();// 0,1
        while(itr.hasNext()){//0,1
            System.out.println(itr.next());
        }



    }
    
    
}