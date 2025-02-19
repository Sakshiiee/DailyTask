class Manager extends Employee {
    public int bonus;

    public Manager(String name, int id, int actualSalary, int bonus) {
        super(name, id, actualSalary); 
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return actualSalary + bonus; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

