package version1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Hourly Employee Test ---");
        HourlyEmployee he1 = new HourlyEmployee(100, "John Doe");
        he1.setTotalHoursWorked(38.5f);
        he1.setRatePerHour(150.00);
        HourlyEmployee he2 = new HourlyEmployee(101, "Alice Smith", 45.00f, 200.00);

        System.out.println("[displayHourlyEmployee()]");
        he1.displayHourlyEmployee();
        System.out.println("[toString()]");
        System.out.println(he1);

        System.out.println("[displayHourlyEmployee()]");
        he2.displayHourlyEmployee();
        System.out.println("[toString()]");
        System.out.println(he2);
        System.out.println();

        System.out.println("--- Piece Worker Employee Test ---");
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(200, "Jane Clark");
        pwe1.setTotalPiecesFinished(85);
        pwe1.setRatePerPiece(12.50);
        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee(201, "Bob Jones", 250, 15.00);

        System.out.println("[displayPieceWorkerEmployee()]");
        pwe1.displayPieceWorkerEmployee();
        System.out.println("[toString()]");
        System.out.println(pwe1);

        System.out.println("[displayPieceWorkerEmployee()]");
        pwe2.displayPieceWorkerEmployee();
        System.out.println("[toString()]");
        System.out.println(pwe2);
        System.out.println();

        System.out.println("--- Commission Employee Test ---");
        CommissionEmployee ce1 = new CommissionEmployee(300, "Mark Wayne");
        ce1.setTotalSale(45000);
        CommissionEmployee ce2 = new CommissionEmployee(301, "Lucy Hale", 125000);

        System.out.println("[displayCommissionEmployee()]");
        ce1.displayCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(ce1);

        System.out.println("[displayCommissionEmployee()]");
        ce2.displayCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(ce2);
        System.out.println();

        System.out.println("--- Base Plus Commission Employee Test ---");
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(400, "Steve Rogers");
        bpce1.setTotalSale(75000);
        bpce1.setBaseSalary(15000);
        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee(401, "Natasha Romanoff", 600000, 25000);

        System.out.println("[displayBasePlusCommissionEmployee()]");
        bpce1.displayBasePlusCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(bpce1);

        System.out.println("[displayBasePlusCommissionEmployee()]");
        bpce2.displayBasePlusCommissionEmployee();
        System.out.println("[toString()]");
        System.out.println(bpce2);
    }
}