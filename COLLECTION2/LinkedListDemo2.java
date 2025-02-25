
import java.util.LinkedList;

public class LinkedListDemo2{

    public static void main(String args[]){

        LinkedList LL = new LinkedList();
        LL.add(10);
        LL.add("sakshiiee");
        LL.add(70);
        LL.add(null);
        LL.add(10);

        System.out.println(LL);                                  //this print in list bcz toString() automatically called

        //using third way of iteration forEach loop
        for (Object obj : LL) {
            System.out.println(obj);            // this gives linewise bcz the loops itearte through the list and give one output at a time

            
        }
    }
}