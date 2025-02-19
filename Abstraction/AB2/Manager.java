class Manager extends Employee {
    public int bonus;

    // Ensure actualSalary is an int
    public Manager(String name, int id, int actualSalary, int bonus) {
        super(name, id, actualSalary); 
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return actualSalary + bonus; // Now both are int, no conversion needed
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Info:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
