public class arrays1{
    public static void main(String[] args) {

        int arr[]= new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
         int size=arr.length;
        System.out.println(size);
        
        for(int i=0;i<size;i++){
            System.out.println("Iteration od array: "+ arr[i]);
        
        }
        System.out.println("default value >> "+arr[0]);

    }
}