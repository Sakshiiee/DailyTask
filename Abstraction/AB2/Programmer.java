class Programmer extends Employee {
    public int hourtime;

    public Programmer(String name, int id, int actualSalary, int hourtime) {
        super(name, id, actualSalary);
        this.hourtime = hourtime; // Correct placement
    }

    @Override
    public int calculateSalary() {
        return actualSalary + hourtime; // Corrected method placement
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
