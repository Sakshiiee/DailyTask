

import java.util.LinkedList;

public class ConvertLL{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList<Integer> LL = new LinkedList<>();

            for(int i : arr){
                LL.add(i);       
            }

            System.out.println("Linkedlist: " + LL);

        
    }
}
//why Collection is accept primitive data type
// ans - autoboxing - collection internally do primitive to wrapper class (int - Integer)
