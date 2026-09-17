package version2;

public class BasePlusCommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { if (empID >= 0) this.empID = empID; }
    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }
    public MyDate getBirthDate() { return birthDate; }
    public void setBirthDate(MyDate birthDate) { this.birthDate = birthDate; }
    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }
    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) { if (totalSale >= 0) this.totalSale = totalSale; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if (baseSalary >= 0) this.baseSalary = baseSalary; }

    public double computeSalary(int currentMonth) {
        double rate;
        if (totalSale < 50000) rate = 0.05;
        else if (totalSale < 100000) rate = 0.10;
        else if (totalSale < 500000) rate = 0.15;
        else rate = 0.20;

        double basePay = baseSalary + (totalSale * rate);

        if (birthDate != null && birthDate.getMonth() == currentMonth) {
            return basePay + 5000.00;
        }
        return basePay;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Sales: P%.2f | Base: P%.2f%n",
                empID, empName, birthDate, dateHired, totalSale, baseSalary);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Base: P%.2f, Sales: P%.2f, Total Salary: P%.2f]",
                empID, empName, birthDate, dateHired, baseSalary, totalSale, computeSalary());
    }
}