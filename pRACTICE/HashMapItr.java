
import java.util.HashMap;

public class HashMapItr{
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("A", "Angular");
        hm.put("P", "Python");
        hm.put("J", "Java");
        hm.put("H", "Hibernate");

        for (String s : hm.keySet()) {
            System.out.println(s + " = " + hm.get(s));
        }

        System.out.println(hm.get("X"));


    }

}