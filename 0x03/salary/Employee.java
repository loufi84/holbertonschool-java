public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return fixedSalary * 0.10;
        }
        return 0.0;
    }

    double calculateTotalSalary(Department department) {
        return (fixedSalary + calculateBonus(department));
    }

}
