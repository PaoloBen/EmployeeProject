package version2;

public class BasePlusCommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate dateOfBirth;
    private MyDate dateHired;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.dateOfBirth = new MyDate();
        this.dateHired = new MyDate();
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate dateOfBirth, MyDate dateHired, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.dateOfBirth = dateOfBirth;
        this.dateHired = dateHired;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { if (empID >= 0) this.empID = empID; }
    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }
    public MyDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(MyDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }
    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) { if (totalSale >= 0) this.totalSale = totalSale; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if (baseSalary >= 0) this.baseSalary = baseSalary; }

    public double computeSalary() {
        double rate = (totalSale < 50000) ? 0.05 : (totalSale < 100000) ? 0.10 : (totalSale < 500000) ? 0.15 : 0.20;
        return baseSalary + (totalSale * rate);
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Sales: ₱%.2f | Base Salary: ₱%.2f%n",
                empID, empName.toString(), dateOfBirth.toString(), dateHired.toString(), totalSale, baseSalary);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Base: ₱%.2f, Sales: ₱%.2f, Salary: ₱%.2f]",
                empID, empName.toString(), dateOfBirth.toString(), dateHired.toString(), baseSalary, totalSale, computeSalary());
    }
}