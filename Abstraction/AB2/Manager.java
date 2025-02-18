class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double actualSalary, int bonus) {
        super(name, id, actualSalary);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return actualSalary + bonus;
    }

    
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}