package version5;

public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        roster.addEmployee(new HourlyEmployee(101, new Name("Alice", "M", "Smith", ""), new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.00));
        roster.addEmployee(new PieceWorkerEmployee(201, new Name("Bob", "C", "Jones", "Jr."), new MyDate(5, 4, 1998), new MyDate(15, 1, 2023), 250, 15.00));
        roster.addEmployee(new CommissionEmployee(301, new Name("Maria", "L", "Reyes", ""), new MyDate(10, 9, 1995), new MyDate(20, 2, 2021), 125000));
        roster.addEmployee(new BasePlusCommissionEmployee(401, new Name("Kevin", "S", "Tan", ""), new MyDate(25, 12, 1992), new MyDate(1, 1, 2019), 600000, 25000));

        System.out.println("======================================================================");
        System.out.println("DYNAMIC ROSTER INITIALIZATION (ArrayList Backend)");
        System.out.println("======================================================================");
        System.out.println("Enrolled: Smith, Alice M. (Hourly)");
        System.out.println("Enrolled: Jones, Bob C. Jr. (Piece Worker)");
        System.out.println("Enrolled: Reyes, Maria L. (Commission)");
        System.out.println("Enrolled: Tan, Kevin S. (Base Plus Commission)");
        System.out.println("Total Roster Size: " + roster.countEmployees() + " employees");

        System.out.println("======================================================================");
        System.out.println("PURE POLYMORPHIC PAYROLL REPORT (Target Month: Sep)");
        System.out.println("[No downcasting; dynamic dispatch via Employee.computeSalary()]");
        System.out.println("======================================================================");
        roster.displayPayroll(9);

        System.out.println("======================================================================");
        System.out.println("COLLECTION REMOVAL TEST");
        System.out.println("======================================================================");
        System.out.println("Removing Employee ID 201... " + (roster.removeEmployee(201) != null ? "Successfully removed." : "Failed."));
        System.out.println("Updated Roster Size: " + roster.countEmployees());
        System.out.println("Current Active Employees:");
        roster.displayAllEmployees();
        System.out.println("======================================================================");
    }
}