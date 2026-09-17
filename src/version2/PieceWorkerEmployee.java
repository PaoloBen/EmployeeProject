package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this.empID = 0;
        this.empName = new Name();
        this.birthDate = new MyDate();
        this.dateHired = new MyDate();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { if (empID >= 0) this.empID = empID; }
    public Name getEmpName() { return empName; }
    public void setEmpName(Name empName) { this.empName = empName; }
    public MyDate getBirthDate() { return birthDate; }
    public void setBirthDate(MyDate birthDate) { this.birthDate = birthDate; }
    public MyDate getDateHired() { return dateHired; }
    public void setDateHired(MyDate dateHired) { this.dateHired = dateHired; }
    public int getTotalPiecesFinished() { return totalPiecesFinished; }
    public void setTotalPiecesFinished(int totalPiecesFinished) { if (totalPiecesFinished >= 0) this.totalPiecesFinished = totalPiecesFinished; }
    public double getRatePerPiece() { return ratePerPiece; }
    public void setRatePerPiece(double ratePerPiece) { if (ratePerPiece >= 0) this.ratePerPiece = ratePerPiece; }

    public double computeSalary(int currentMonth) {
        double basePay = (totalPiecesFinished * ratePerPiece) + ((totalPiecesFinished / 100) * (10 * ratePerPiece));

        if (birthDate != null && birthDate.getMonth() == currentMonth) {
            return basePay + 5000.00;
        }
        return basePay;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayPieceWorkerEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Pieces: %d | Rate/Piece: P%.2f%n",
                empID, empName, birthDate, dateHired, totalPiecesFinished, ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: P%.2f, Total Salary: P%.2f]",
                empID, empName, birthDate, dateHired, totalPiecesFinished, ratePerPiece, computeSalary());
    }
}