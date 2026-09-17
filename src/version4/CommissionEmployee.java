package version4;

public class CommissionEmployee extends Employee {
    private double totalSale;

    public CommissionEmployee() {
        super();
        this.totalSale = 0.0;
    }

    public CommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSale) {
        super(empID, empName, birthDate, dateHired);
        setTotalSale(totalSale);
    }

    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) { if (totalSale >= 0) this.totalSale = totalSale; }

    public double getCommissionRate() {
        if (totalSale < 50000) return 0.05;
        if (totalSale < 100000) return 0.10;
        if (totalSale < 500000) return 0.15;
        return 0.20;
    }

    public double computeSalary(int currentMonth) {
        double base = totalSale * getCommissionRate();
        if (getBirthDate() != null && getBirthDate().getMonth() == currentMonth) {
            base += 5000.00;
        }
        return base;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayCommissionEmployee() {
        super.displayEmployee();
        System.out.printf("Sales: P%.2f%n", totalSale);
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee [%s, Sales: P%.2f, Salary: P%.2f]",
                super.toString(), totalSale, computeSalary());
    }
}