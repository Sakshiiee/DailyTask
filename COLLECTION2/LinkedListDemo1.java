
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1{

    public static void main(String[] args) {
        
       
        LinkedList<Object> LL = new LinkedList<>();
        LL.add(10);
        LL.add(null);
        LL.add(10);
        LL.add("String");

        //second way of iteration

        Iterator itr = LL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}