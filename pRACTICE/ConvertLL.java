

import java.util.LinkedList;

public class ConvertLL{

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinkedList LL = new LinkedList<>();

            for(int i : arr){
                LL.add(i);
            }

            System.out.println("Linkedlist: " + LL);

        
    }
}
