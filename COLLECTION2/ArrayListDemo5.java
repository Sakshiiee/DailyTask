
import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo5{

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(0);
        ar.add(1);
        ar.add(1);              // //duplicates are allowed
        ar.add(null);         //null is allowed

        //first way of iteration
    //    System.out.println(ar);

        //second way of iteration using iterator
        Iterator itr = ar.iterator();// 0,1
        while(itr.hasNext()){//0,1
            System.out.println(itr.next());
        }

        //third way of iteration by ForEach loop
        // for(Object obj :
        // ar){
        //     System.out.println(obj);


        // }

        //








    }
    
    
}