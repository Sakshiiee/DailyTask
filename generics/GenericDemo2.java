class Demo<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}

public class GenericDemo2{
    public static void main(String[] args) {
        Demo<String> d = new Demo<>();
        d.setValue("hello");
        System.out.println(d.getValue());

        Demo<Integer> d1= new Demo<>();
        d1.setValue(130);
        System.out.println(d1.getValue());
    }
}