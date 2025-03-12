





public class HashSetDemo{


    public void getData(){
        java.util.HashSet hs = new java.util.HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add("sakshi");
        hs.add(null);

        System.out.println(hs);
        

    }
    public static void main(String[] args) {
        HashSetDemo hs1  = new HashSetDemo();
        hs1.getData();
    }   
}