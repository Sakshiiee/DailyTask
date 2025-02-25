
import java.util.LinkedList;

public class LinkedListDemo5{

    public static void main(String args[]){

        LinkedList<Boolean> LL = new LinkedList<>();

        LL.add(false);
        LL.add(null);
        LL.add(true);
        //LL.add(10);
        LL.add("sakshi");

        // THIRD WAY OF ITERARTION USING FOR EACH

        for(Object obj: LL){
            System.out.println(obj);
        }


    }
}