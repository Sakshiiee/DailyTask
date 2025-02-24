
import java.util.LinkedList;

public class LinkedListDemo{

    public static void main(String args[]){

        LinkedList arr = new LinkedList();

        arr.add(10);
        arr.add(1);
        arr.add("sakshiiee");
        arr.add(1);
        arr.add(null);

        System.out.println(arr);

        int a = arr.size();
        System.out.println("size: " + a);


        arr.addFirst("ABC");
        System.out.println(arr);

        arr.addLast("XYZ");
        System.err.println(arr);

        LinkedList clone = (LinkedList) arr.clone();
        System.out.println(clone);

}
}