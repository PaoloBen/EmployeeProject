package version3;

public class Main {
    public static void main(String[] args) {
        Employee[] roster = new Employee[2];
        roster[0] = new HourlyEmployee(101, new Name("Alice", "M", "Smith", ""), new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.0);
        roster[1] = new PieceWorkerEmployee(201, new Name("Bob", "C", "Jones", "Jr."), new MyDate(5, 4, 1998), new MyDate(15, 1, 2023), 250, 15.0);

        System.out.println("=== POLYMORPHIC PAYROLL REPORT (Target Month: Sep) ===");
        for (int i = 0; i < roster.length; i++) {
            double basePay = roster[i].computeSalary(-1);
            double totalPayout = roster[i].computeSalary(9);
            double bonus = totalPayout - basePay;
            String eligibility = bonus > 0 ? "(Eligible)" : "(Ineligible)";

            System.out.println("================================");
            System.out.printf("%d. %s%n", i + 1, roster[i].toString());
            System.out.printf("Base Pay: P%,.2f | Birthday Bonus: P%,.2f %s%n", basePay, bonus, eligibility);
            System.out.printf("Total Payout: P%,.2f%n", totalPayout);
        }

        System.out.println("\n=== OBJECT CONTRACT TESTS (equals & hashCode) ===");
        HourlyEmployee emp1 = new HourlyEmployee(101, new Name("Alice", "M", "Smith", ""), new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.0);
        HourlyEmployee emp1Identical = new HourlyEmployee(101, new Name("Alice", "M", "Smith", ""), new MyDate(18, 9, 2000), new MyDate(1, 6, 2022), 45.0f, 200.0);
        HourlyEmployee emp2 = new HourlyEmployee(102, new Name("David", "A", "White", ""), new MyDate(1, 1, 1990), new MyDate(1, 1, 2020), 40.0f, 150.0);

        System.out.println("emp1 equals emp1Identical: " + emp1.equals(emp1Identical));
        System.out.println("emp1 hashCode: " + emp1.hashCode() + " | emp1Identical hashCode: " + emp1Identical.hashCode() + " (Match: " + (emp1.hashCode() == emp1Identical.hashCode()) + ")");
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        System.out.println("\n=== DEEP CLONE VERIFICATION ===");
        try {
            HourlyEmployee empClone = (HourlyEmployee) emp1.clone();
            System.out.println("Original Name before modification: " + emp1.getEmpName());
            empClone.getEmpName().setLastName("Taylor");
            System.out.println("Clone Name changed to: " + empClone.getEmpName());
            System.out.println("Original Name after modification: " + emp1.getEmpName() + " (Deep copy successful!)");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}