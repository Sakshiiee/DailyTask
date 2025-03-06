import java.util.ArrayList;

public class ComparingAL {
    public static void main(String[] args) {
        // ArrayList<Integer> arl1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // ArrayList<Integer> arl2 = new ArrayList<>(Arrays.asList(4, 2, 3, 1));
        ArrayList<Integer> arl1 = new ArrayList<>();
        arl1.add(1);
        arl1.add(2);
        arl1.add(3);
        arl1.add(4);
        ArrayList<Integer> arl2 = new ArrayList<>();
        arl2.add(4);
        arl2.add(2);
        arl2.add(3);
        arl2.add(1);



        if(arl1.equals(arl2)){
            System.out.println("ArrayLists are equal");
        } else {
            System.out.println("ArrayLists are not equal");
        }
    }
}
