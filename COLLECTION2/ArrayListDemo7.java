
import java.util.ArrayList;

//Design  a program which return arraylist object to that method

public class ArrayListDemo7{

    public ArrayList getData(){
        ArrayList ar = new ArrayList<>();
        ar.add(0);
        ar.add(1);
        ar.add(1);              // //duplicates are allowed
        ar.add(null);   
        return ar;
      }

    public static void main(String[] args) {
        ArrayListDemo7 ar = new ArrayListDemo7();
        ArrayList al = ar.getData();
        System.out.println(al);

                
         }
}