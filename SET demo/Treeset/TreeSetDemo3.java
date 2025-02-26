
import java.util.TreeSet;

// Design  a program which return TreeSET object to that method
public class TreeSetDemo3{

    public TreeSet getData(){
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(30);
        ts.add(70);
        ts.add(67);
        return ts;

    }

    public static void main(String[] args) {
        TreeSetDemo3 ts = new TreeSetDemo3();
        TreeSet ts1 = ts.getData();
        System.out.println(ts1);
    }
}