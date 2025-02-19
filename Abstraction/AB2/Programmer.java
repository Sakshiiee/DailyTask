class Programmer extends Employee {
    public int hourtime;

    public Programmer(String name, int id, int actualSalary, int hourtime) {
        super(name, id, actualSalary);
        this.hourtime = hourtime; 
    }

    @Override
    public int calculateSalary() {
        return actualSalary + hourtime;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
