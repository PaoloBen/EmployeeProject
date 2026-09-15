import version2.Name;
import version2.MyDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== VERSION 1 TESTS ======");
        version1.HourlyEmployee v1He = new version1.HourlyEmployee(101, "Alice Smith", 45.00f, 200.00);
        v1He.displayHourlyEmployee();
        System.out.println(v1He);

        System.out.println();

        version1.PieceWorkerEmployee v1Pwe = new version1.PieceWorkerEmployee(201, "Bob Jones", 250, 15.00);
        v1Pwe.displayPieceWorkerEmployee();
        System.out.println(v1Pwe);

        System.out.println("\n====== VERSION 2 TESTS ======");
        Name name1 = new Name("John", "William", "Doe", "");
        MyDate dob1 = new MyDate(5, 12, 1990);
        MyDate hired1 = new MyDate(1, 15, 2020);
        version2.HourlyEmployee v2He = new version2.HourlyEmployee(100, name1, dob1, hired1, 45.5f, 150.00);
        v2He.displayHourlyEmployee();
        System.out.println(v2He);

        System.out.println();

        Name name2 = new Name("Jane", "Anne", "Clark", "Sr.");
        MyDate dob2 = new MyDate(8, 22, 1995);
        MyDate hired2 = new MyDate(3, 10, 2021);
        version2.PieceWorkerEmployee v2Pwe = new version2.PieceWorkerEmployee(200, name2, dob2, hired2, 250, 15.00);
        v2Pwe.displayPieceWorkerEmployee();
        System.out.println(v2Pwe);
    }
}