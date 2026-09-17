package version2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Name & Date Output Verification ---");
        Name n1 = new Name("Alice", "M", "Smith", "");
        MyDate d1 = new MyDate(18, 9, 2000);
        MyDate h1 = new MyDate(1, 6, 2022);

        System.out.print("Name: ");
        n1.displayName();
        System.out.println();
        System.out.print("Date: ");
        d1.displayDate();
        System.out.println();
        System.out.println();

        System.out.println("--- Hourly Employee Payroll Test ---");
        HourlyEmployee he1 = new HourlyEmployee(101, n1, d1, h1, 45.0f, 200.00);

        System.out.println("[displayHourlyEmployee()]");
        he1.displayHourlyEmployee();

        System.out.println("[toString()]");
        System.out.println(he1);

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Oct) Salary: P%.2f%n", he1.computeSalary(10));
        System.out.printf("Birth Month (Sep) Salary (+P5,000.00): P%.2f%n", he1.computeSalary(9));
        System.out.println();

        System.out.println("--- Piece Worker Employee Payroll Test ---");
        Name n2 = new Name("Bob", "C", "Jones", "Jr.");
        MyDate d2 = new MyDate(5, 4, 1998);
        MyDate h2 = new MyDate(15, 1, 2023);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(201, n2, d2, h2, 250, 15.00);

        System.out.println("[displayPieceWorkerEmployee()]");
        pwe1.displayPieceWorkerEmployee();

        System.out.println("[toString()]");
        System.out.println(pwe1);

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (May) Salary: P%.2f%n", pwe1.computeSalary(5));
        System.out.printf("Birth Month (Apr) Salary (+P5,000.00): P%.2f%n", pwe1.computeSalary(4));
        System.out.println();

        System.out.println("--- Commission Employee Payroll Test ---");
        Name n3 = new Name("Maria", "L", "Reyes", "");
        MyDate d3 = new MyDate(10, 9, 1995);
        MyDate h3 = new MyDate(20, 2, 2021);
        CommissionEmployee ce1 = new CommissionEmployee(301, n3, d3, h3, 125000);

        ce1.displayCommissionEmployee();
        System.out.println(ce1);
        System.out.printf("Regular Month (Oct) Salary: P%.2f%n", ce1.computeSalary(10));
        System.out.printf("Birth Month (Sep) Salary (+P5,000.00): P%.2f%n", ce1.computeSalary(9));
        System.out.println();

        System.out.println("--- Base Plus Commission Employee Payroll Test ---");
        Name n4 = new Name("Kevin", "S", "Tan", "");
        MyDate d4 = new MyDate(25, 12, 1992);
        MyDate h4 = new MyDate(1, 1, 2019);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(401, n4, d4, h4, 600000, 25000);

        bpce1.displayBasePlusCommissionEmployee();
        System.out.println(bpce1);
        System.out.printf("Regular Month (Jan) Salary: P%.2f%n", bpce1.computeSalary(1));
        System.out.printf("Birth Month (Dec) Salary (+P5,000.00): P%.2f%n", bpce1.computeSalary(12));
    }
}