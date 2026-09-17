package version4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE ROSTER INITIALIZATION & ENROLLMENT ===");
        EmployeeRoster roster = new EmployeeRoster(6);

        HourlyEmployee he1 = new HourlyEmployee(101, new Name("Alice", "M", "Smith", ""), new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.00);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(201, new Name("Bob", "C", "Jones", "Jr."), new MyDate(5, 4, 1998), new MyDate(15, 1, 2023), 250, 15.00);
        CommissionEmployee ce1 = new CommissionEmployee(301, new Name("Maria", "L", "Reyes", ""), new MyDate(10, 9, 1995), new MyDate(20, 2, 2021), 125000);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(401, new Name("Kevin", "S", "Tan", ""), new MyDate(25, 12, 1992), new MyDate(1, 1, 2019), 600000, 25000);
        HourlyEmployee he2 = new HourlyEmployee(102, new Name("David", "A", "White", ""), new MyDate(1, 1, 1990), new MyDate(1, 1, 2020), 40.0f, 150.00);

        System.out.println("Added: " + he1.getEmpName() + " (Hourly) -> " + (roster.addEmployee(he1) ? "Success" : "Failed"));
        System.out.println("Added: " + pwe1.getEmpName() + " (Piece Worker) -> " + (roster.addEmployee(pwe1) ? "Success" : "Failed"));
        System.out.println("Added: " + ce1.getEmpName() + " (Commission) -> " + (roster.addEmployee(ce1) ? "Success" : "Failed"));
        System.out.println("Added: " + bpce1.getEmpName() + " (Base Plus Commission) -> " + (roster.addEmployee(bpce1) ? "Success" : "Failed"));
        System.out.println("Added: " + he2.getEmpName() + " (Hourly) -> " + (roster.addEmployee(he2) ? "Success" : "Failed"));

        HourlyEmployee extra = new HourlyEmployee(103, new Name("Over", "Flow", "Test", ""), new MyDate(1, 1, 2000), new MyDate(1, 1, 2020), 40.0f, 100.00);
        roster.addEmployee(extra);
        HourlyEmployee extra2 = new HourlyEmployee(104, new Name("Full", "Capacity", "Test", ""), new MyDate(1, 1, 2000), new MyDate(1, 1, 2020), 40.0f, 100.00);
        System.out.println("Added: " + extra2.getEmpName() + " (Capacity Check) -> " + (roster.addEmployee(extra2) ? "Success" : "Failed"));

        System.out.println("\n=== ROSTER COMPOSITION COUNTS ===");
        System.out.println("Total Employees: " + roster.getCount() + "/" + roster.getMax());
        System.out.println("Hourly Employees: " + roster.countHE());
        System.out.println("Piece Worker Employees: " + roster.countPWE());
        System.out.println("Commission Employees (Pure): " + roster.countCE());
        System.out.println("Base Plus Commission Employees: " + roster.countBPCE());

        System.out.println("\n=== ROSTER PAYROLL REPORT (Target Month: Sep) ===");
        roster.displayPayroll(9);

        System.out.println("\n=== TESTING EMPLOYEE REMOVAL & ARRAY COMPACTION ===");
        System.out.println("Removing Employee ID 201 (" + pwe1.getEmpName() + ")... " + (roster.removeEmployee(201) != null ? "Successfully removed." : "Failed."));
        System.out.println("Current Employee Count: " + roster.getCount());
        System.out.println("Remaining Employees in Roster:");
        roster.displayAllEmployees();
    }
}