
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo4{
    
    public static void main(String args[]){

        LinkedList<String> LL = new LinkedList<>();
        LL.add("sakshi");
        LL.add("abc");
        LL.add("apple");
        //LL.add(90);
        LL.add(null);


        Iterator itr = LL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}