public class Main {
    public static void main(String args[]) {
        Employee manager = new Manager("Sakshi", 101, 8000, 2000);
        Employee programmer = new Programmer("xyz", 103, 5000, 1000);

        manager.displayInfo();
        System.out.println();
        System.out.println();
        programmer.displayInfo();
    }
}