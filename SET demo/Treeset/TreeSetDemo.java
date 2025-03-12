import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo{	
	public static void main(String args[]) {
		
		TreeSet ts = new TreeSet();

        // **************************    first method adding number   ************************
		ts.add(10);
		ts.add(20);
		ts.add(10);
		//ts.add(null);
		//ts.add("sakshiiee");
		ts.add(30);

        
        // first way of iteration

		System.out.println(ts);
        

        TreeSet ts2 = new TreeSet();
        ts2.add(10);
        ts2.add(30);
      //  ts2.add(45);

        
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(34);
       

		
        // *****************     second method of contains = element present or not   ******************
        // boolean b = ts.contains(10);
        // System.out.println(b +" : the given num is present");



        // ******************     third method containAll= if list2 elements present in list1 or   ****************
          
        // boolean b1 = ts.containsAll(ts2);
        // System.out.println(b1);

        // // boolean b1 = ts.containsAll(ar);
        // // System.out.println(b1);



        // ***********************   fourth method ceiling =     ******************************
        /// 1. if no is present give that num
        /// 2. if no not preent give next higher element
        /// 3. if no. is greater then NULL return
        // System.out.println(ts.ceiling(10));
         //System.out.println(ts.ceiling(19));
        // System.out.println(ts.ceiling(34));


        // // ******************  fifth method clear = elements get empty *******************************
        // // ts.clear();
        // // System.out.println("After clearing : " + ts);

        System.out.println("before clearing arraylist: "+ ar);
  
        ar.clear();
        System.out.println("after CLAERING arraylist: "+ ar);




	}

    
}


