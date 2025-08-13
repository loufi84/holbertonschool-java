public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            double baseBonus = getFixedSalary() * 20 / 100;
            double additionalBonus = (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01;
            return baseBonus + additionalBonus;
        }
        return 0.0;
    }
}
