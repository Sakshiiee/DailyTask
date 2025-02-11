
import java.util.Scanner;

public class ZeroEH{
    public static void main(String[] args) {

        try{

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Numerator: ");
        int Numerator = s.nextInt();

        System.out.print("Enter Denominator: ");
        int Denominator = s.nextInt();

        int res = Numerator/Denominator;
        System.out.print("Result: " + res);
        
    }catch(ArithmeticException e){
        System.out.println("ERROR !!");
        System.out.println("Cannot divide by Zero!");

    }

    }

}