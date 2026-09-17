package version4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSale, double baseSalary) {
        super(empID, empName, birthDate, dateHired, totalSale);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if (baseSalary >= 0) this.baseSalary = baseSalary; }

    @Override
    public double computeSalary(int currentMonth) {
        double base = baseSalary + (getTotalSale() * getCommissionRate());
        if (getBirthDate() != null && getBirthDate().getMonth() == currentMonth) {
            base += 5000.00;
        }
        return base;
    }

    @Override
    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayBasePlusCommissionEmployee() {
        super.displayEmployee();
        System.out.printf("Sales: P%.2f | Base Salary: P%.2f%n", getTotalSale(), baseSalary);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [%s, Base: P%.2f, Salary: P%.2f]",
                super.toString(), baseSalary, computeSalary());
    }
}