interface A{
    void printA();
}
interface B{
    void printB();
}
public class Main implements A,B{
    public void printA(){
        System.out.println("Print a");
    }
    public void printB(){
        System.out.println("Print b");
    }
    
}

