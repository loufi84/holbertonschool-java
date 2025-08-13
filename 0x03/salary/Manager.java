public class Manager extends Employee {
    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            double delta = department.getAchievedTargetValue() - department.getTargetValue();
            return (getFixedSalary() * 0.20) + (delta * 0.01);
        }
        return 0.0;
    }
}