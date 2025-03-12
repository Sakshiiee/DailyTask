
import java.util.Iterator;







public class HashSetDemo1{


    public void getData(){
        java.util.HashSet hs = new java.util.HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add("sakshi");          //hetro
        hs.add(null);                   //null allowd

        //norma;
        //System.out.println(hs);



// iterator
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        

    }
    public static void main(String[] args) {
        HashSetDemo hs1  = new HashSetDemo();
        hs1.getData();
    }   
}