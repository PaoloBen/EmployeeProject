package version2;

public class HourlyEmployee {
    private int empID;
    private Name empName;
    private MyDate dateOfBirth;
    private MyDate dateHired;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.dateOfBirth = new MyDate();
        this.dateHired = new MyDate();
        this.totalHoursWorked = 0.0f;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate dateOfBirth, MyDate dateHired, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.dateOfBirth = dateOfBirth;
        this.dateHired = dateHired;
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { if (empID >= 0) this.empID = empID; }
    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }
    public MyDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(MyDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }
    public float getTotalHoursWorked() { return totalHoursWorked; }
    public void setTotalHoursWorked(float totalHoursWorked) { if (totalHoursWorked >= 0) this.totalHoursWorked = totalHoursWorked; }
    public double getRatePerHour() { return ratePerHour; }
    public void setRatePerHour(double ratePerHour) { if (ratePerHour >= 0) this.ratePerHour = ratePerHour; }

    public double computeSalary() {
        if (totalHoursWorked <= 40) return totalHoursWorked * ratePerHour;
        return (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
    }

    public void displayHourlyEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Hours: %.2f | Rate: ₱%.2f/hr%n",
                empID, empName.toString(), dateOfBirth.toString(), dateHired.toString(), totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: ₱%.2f, Salary: ₱%.2f]",
                empID, empName.toString(), dateOfBirth.toString(), dateHired.toString(), totalHoursWorked, ratePerHour, computeSalary());
    }
}