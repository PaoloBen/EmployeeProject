package version3;

import java.util.Objects;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, birthDate, dateHired);
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public float getTotalHoursWorked() { return totalHoursWorked; }
    public void setTotalHoursWorked(float totalHoursWorked) { if (totalHoursWorked >= 0) this.totalHoursWorked = totalHoursWorked; }
    public double getRatePerHour() { return ratePerHour; }
    public void setRatePerHour(double ratePerHour) { if (ratePerHour >= 0) this.ratePerHour = ratePerHour; }

    @Override
    public double computeSalary(int currentMonth) {
        double base;
        if (totalHoursWorked <= 40) {
            base = totalHoursWorked * ratePerHour;
        } else {
            base = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
        }
        return base + super.computeSalary(currentMonth);
    }

    @Override
    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayHourlyEmployee() {
        super.displayEmployee();
        System.out.printf("Hours: %.2f | Rate: P%.2f/hr%n", totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [%s, Hours: %.2f, Rate: P%.2f, Total Salary: P%.2f]",
                super.toString(), totalHoursWorked, ratePerHour, computeSalary());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        HourlyEmployee that = (HourlyEmployee) obj;
        return Float.compare(that.totalHoursWorked, totalHoursWorked) == 0 &&
                Double.compare(that.ratePerHour, ratePerHour) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalHoursWorked, ratePerHour);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}