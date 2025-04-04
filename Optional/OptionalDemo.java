import java.util.Optional;
public class OptionalDemo{

    public static void main(String args[]){

        //String str="sokshi";
         String str= null;     
        //  String str= "abc";                           
       String str1="sakshi";

        Optional<String> op = Optional.ofNullable(str);


        // System.out.println(op.isPresent());
        //System.out.println(op.isEmpty());
        //System.out.println(op.equals(Optional.of(str1)));
    System.out.println(op.get());                           //  if trying to get NULL value = will give exception NoSuchElementException
       //System.err.println(op.orElse(str));
       //System.out.println("No value");
       System.out.println(op.stream());                           
        System.out.println(op.stream().count());            
    }
}