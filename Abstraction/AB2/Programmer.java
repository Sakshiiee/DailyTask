
import javax.sound.midi.SysexMessage;

class Programmer extends Employee{

    public Programmer(String name, int id, double actualSalary, int hourtime){
        super(name, id, actualSalary);
        this.hourtime=hourtime;

        public int calculateSalary(){
            return actualSalary + hourtime;

        }

        public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
    
    
}