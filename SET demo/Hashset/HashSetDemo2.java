







public class HashSetDemo2{


    public void getData(){
        java.util.HashSet hs = new java.util.HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add("sakshi");          //hetro
        hs.add(null);                   //null allowd

        //
        //System.out.println(hs);

        // Iterator itr = hs.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

       //for each loop
        for (Object obj : hs) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        HashSetDemo hs1  = new HashSetDemo();
        hs1.getData();
    }   
}