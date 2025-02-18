public class Main{

    public static void main(String args[]){

        Employee Manager = new Manager("SAkshi",101,8000,2000);
        Employee Programmer = new Programmer("xyz",103,5000,1000);

        Manager.displayInfo();
        Programmer.displayInfo();

    }
}