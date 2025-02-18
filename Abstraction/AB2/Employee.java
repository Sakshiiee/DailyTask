// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
// Create subclasses Manager and  Programmer that extend the Employee class and 
//implement the respective methods to calculate salary and display information for each role.


abstract class Employee{

    public String name;
    public int id;
    public int actualSalary;

    public Employee(String name, int id, int actualSalary){

        this.name=name;
        this.id= id;
        this.actualSalary= actualSalary;

    }

    public  abstract int calculateSalary();
    public abstract void displayInfo();
}