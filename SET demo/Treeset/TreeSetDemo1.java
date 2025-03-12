
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1{
    public static void main(String args[]){

        TreeSet ts = new TreeSet();

        //try {
            ts.add("sakshiiee");
            ts.add("abc");
            ts.add("xyz");
            ts.add("komal");
         //   ts.add(null);
        // } catch (NullPointerException e) {
        //     System.err.println("NULL not allowed in treeset");
        // }
        

        //second way of iteration byusing iterator

        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}