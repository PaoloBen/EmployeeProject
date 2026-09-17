package version4;

public class EmployeeRoster {
    private Employee[] empList;
    private int max;
    private int count;

    public EmployeeRoster() {
        this.max = 10;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new Employee[max];
        this.count = 0;
    }

    public boolean addEmployee(Employee emp) {
        if (emp == null || count >= max) return false;
        empList[count++] = emp;
        return true;
    }

    public Employee removeEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (empList[i].getEmpID() == empID) {
                Employee removed = empList[i];
                for (int j = i; j < count - 1; j++) {
                    empList[j] = empList[j + 1];
                }
                empList[--count] = null;
                return removed;
            }
        }
        return null;
    }

    public Employee searchEmployee(int empID) {
        for (int i = 0; i < count; i++) {
            if (empList[i].getEmpID() == empID) {
                return empList[i];
            }
        }
        return null;
    }

    public int countHE() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) c++;
        }
        return c;
    }

    public int countPWE() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) c++;
        }
        return c;
    }

    public int countCE() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getClass() == CommissionEmployee.class) c++;
        }
        return c;
    }

    public int countBPCE() {
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) c++;
        }
        return c;
    }

    public void displayHE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                ((HourlyEmployee) empList[i]).displayHourlyEmployee();
            }
        }
    }

    public void displayPWE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) empList[i]).displayPieceWorkerEmployee();
            }
        }
    }

    public void displayCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getClass() == CommissionEmployee.class) {
                ((CommissionEmployee) empList[i]).displayCommissionEmployee();
            }
        }
    }

    public void displayBPCE() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                ((BasePlusCommissionEmployee) empList[i]).displayBasePlusCommissionEmployee();
            }
        }
    }

    public void displayAllEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. ID: %d | Name: %s | Type: %s%n",
                    i + 1, empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getClass().getSimpleName());
        }
    }

    public void displayPayroll(int currentMonth) {
        for (int i = 0; i < count; i++) {
            Employee emp = empList[i];
            double salary = 0.0;
            String typeStr = "";

            if (emp instanceof HourlyEmployee) {
                salary = ((HourlyEmployee) emp).computeSalary(currentMonth);
                typeStr = "Hourly";
            } else if (emp instanceof PieceWorkerEmployee) {
                salary = ((PieceWorkerEmployee) emp).computeSalary(currentMonth);
                typeStr = "Piece Worker";
            } else if (emp instanceof BasePlusCommissionEmployee) {
                salary = ((BasePlusCommissionEmployee) emp).computeSalary(currentMonth);
                typeStr = "Base Plus Commission";
            } else if (emp instanceof CommissionEmployee) {
                salary = ((CommissionEmployee) emp).computeSalary(currentMonth);
                typeStr = "Commission";
            }

            String bonusStr = (emp.getBirthDate() != null && emp.getBirthDate().getMonth() == currentMonth) ? " (Birthday Bonus Applied)" : "";
            System.out.printf("[%s] ID: %d | Name: %s | Salary: P%,.2f%s%n",
                    typeStr, emp.getEmpID(), emp.getEmpName(), salary, bonusStr);
        }
    }

    public int getCount() { return count; }
    public int getMax() { return max; }
}