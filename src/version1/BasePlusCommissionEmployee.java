package version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this.empID = 0;
        this.empName = "N/A";
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = 0.0;
        this.baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        setTotalSale(totalSale);
        setBaseSalary(baseSalary);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { if (empID >= 0) this.empID = empID; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public double getTotalSale() { return totalSale; }
    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) this.totalSale = totalSale;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        double rate;
        if (totalSale < 50000) rate = 0.05;
        else if (totalSale < 100000) rate = 0.10;
        else if (totalSale < 500000) rate = 0.15;
        else rate = 0.20;

        return baseSalary + (totalSale * rate);
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | Total Sale: ₱%.2f | Base Salary: ₱%.2f%n",
                empID, empName, totalSale, baseSalary);
    }

    @Override
    public String toString() {
        double rate;
        if (totalSale < 50000) rate = 0.05;
        else if (totalSale < 100000) rate = 0.10;
        else if (totalSale < 500000) rate = 0.15;
        else rate = 0.20;

        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, Base Salary: ₱%.2f, Sales: ₱%.2f, Rate: %.0f%%, Total Salary: ₱%.2f]",
                empID, empName, baseSalary, totalSale, rate * 100, computeSalary());
    }
}
