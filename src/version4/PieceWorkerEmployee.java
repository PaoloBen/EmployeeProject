package version4;

public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        super();
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0.0;
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {
        super(empID, empName, birthDate, dateHired);
        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public int getTotalPiecesFinished() { return totalPiecesFinished; }
    public void setTotalPiecesFinished(int totalPiecesFinished) { if (totalPiecesFinished >= 0) this.totalPiecesFinished = totalPiecesFinished; }
    public double getRatePerPiece() { return ratePerPiece; }
    public void setRatePerPiece(double ratePerPiece) { if (ratePerPiece >= 0) this.ratePerPiece = ratePerPiece; }

    public double computeSalary(int currentMonth) {
        double base = (totalPiecesFinished * ratePerPiece) + ((totalPiecesFinished / 100) * (10 * ratePerPiece));
        if (getBirthDate() != null && getBirthDate().getMonth() == currentMonth) {
            base += 5000.00;
        }
        return base;
    }

    public double computeSalary() {
        return computeSalary(-1);
    }

    public void displayPieceWorkerEmployee() {
        super.displayEmployee();
        System.out.printf("Pieces: %d | Rate/Piece: P%.2f%n", totalPiecesFinished, ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee [%s, Pieces: %d, Rate: P%.2f, Salary: P%.2f]",
                super.toString(), totalPiecesFinished, ratePerPiece, computeSalary());
    }
}