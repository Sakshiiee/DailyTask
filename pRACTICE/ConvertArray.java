import java.util.ArrayList;

public class ConvertArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8};
        ArrayList al = new ArrayList<>();

        for (int i : arr) {
            al.add(i);
        }
        System.out.println("ArrayList: " + al);
    }
}
