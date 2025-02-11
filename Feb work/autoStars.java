import java.util.Scanner;

public class autoStars{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



    try{
        System.out.println("Choose a Star Pattern:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Pyramid");
        System.out.print("Enter your number: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();


        switch (choice) {
            case 1:
                traingleMade(n);
                break;
            case 2:
                squareMade(n);
                break;
            case 3:
                pyramidMade(n);
                break;
            default:
                System.out.println("Invalid choice!");
                System.out.println("Default pattern is triangle: ");
                pyramidMade(n);
        }
    
        }catch (Exception e){
            System.out.println("Invalid !!!");
            System.out.println("You entered character or string instead of number!");
        }

        
    }

    
    public static void traingleMade(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void squareMade(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pyramidMade(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}