
// import java.util.Scanner;

// public class equalNum {
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);

//         System.out.print("Enter first Num: ");
//         int num1 = s.nextInt();

//         System.out.print("Enter second Num: ");
//         int num2 = s.nextInt();

//         System.out.print("Enter third Num: ");
//         int num3 = s.nextInt();

//         System.out.print("Enter fourth Num: ");
//         int num4 = s.nextInt();

//         if (num1 == num2 && num2 == num3 && num3 == num4) {
//             System.out.println("Numbers are equal!");
//         } else {
//             System.out.println("Numbers are not equal!");
//         }

//         s.close();
//     }
// }


import java.util.InputMismatchException;
import java.util.Scanner;

public class equalNum{
    public static void main(String args[]){
          
        Scanner s = new Scanner(System.in);

        try {
      
        System.out.print("Enter first Num: ");
        int num1 = s.nextInt();

        System.out.print("Enter second Num: ");
        int num2 = s.nextInt();

        System.out.print("Enter third Num: ");
        int num3 = s.nextInt();

        System.out.print("Enter third num: ");
        int num4 = s.nextInt();


        if(num1 == num2 && num2 == num3 && num3 == num4){

            System.out.println("Numbers are equals!");

        }else{

            System.out.println("Numbers are not equals!");
        }
            
        } catch (InputMismatchException e) {

            System.out.println("Invalid !! Write integers only! ");
            
        }
        finally{
            s.close();
            
     }
        
        
    }
}



