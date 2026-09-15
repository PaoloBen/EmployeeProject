import version2.Name;
import version2.MyDate;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("====== VERSION 1 TESTS ======");
        version1.CommissionEmployee v1Ce = new version1.CommissionEmployee(301, "Lucy Hale", 125000);
        v1Ce.displayCommissionEmployee();
        System.out.println(v1Ce);

        System.out.println();

        version1.BasePlusCommissionEmployee v1Bpce = new version1.BasePlusCommissionEmployee(401, "Natasha Romanoff", 600000, 25000);
        v1Bpce.displayBasePlusCommissionEmployee();
        System.out.println(v1Bpce);

        System.out.println("\n====== VERSION 2 TESTS ======");
        Name name3 = new Name("Mark", "Thomas", "Wayne", "Jr.");
        MyDate dob3 = new MyDate(11, 30, 1988);
        MyDate hired3 = new MyDate(6, 1, 2018);
        version2.CommissionEmployee v2Ce = new version2.CommissionEmployee(300, name3, dob3, hired3, 125000);
        v2Ce.displayCommissionEmployee();
        System.out.println(v2Ce);

        System.out.println();

        Name name4 = new Name("Lucy", "Marie", "Hale", "");
        MyDate dob4 = new MyDate(2, 14, 1992);
        MyDate hired4 = new MyDate(9, 20, 2019);
        version2.BasePlusCommissionEmployee v2Bpce = new version2.BasePlusCommissionEmployee(400, name4, dob4, hired4, 600000, 25000);
        v2Bpce.displayBasePlusCommissionEmployee();
        System.out.println(v2Bpce);
    }
}