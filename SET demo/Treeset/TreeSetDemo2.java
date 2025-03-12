
import java.util.TreeSet;

public class TreeSetDemo2{
    
    public static void main(String[] args) {
        
        TreeSet<Double> ts = new TreeSet<>();
       // try 
       
            ts.add(1.0);
            ts.add(44.981);
            ts.add(9.132);

            
            //ts.add("Sakshii");
        // } catch (ClassCastException e) {
        //     System.out.println("iT is homogeneous Data type so String not allowed here");
        // }
        
        //third way of iterator using ForEach loop

        // for(Object s : ts){
        //     System.out.println(s);
        // }

       
        for (Double d : ts) { 
            System.out.println(d);
        }
    
    }
}
    
    