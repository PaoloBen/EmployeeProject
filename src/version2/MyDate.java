package version2;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(1, 1, 2000);
    }

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() { return day; }
    public void setDay(int day) {
        if (day >= 1 && day <= 31) this.day = day;
    }

    public int getMonth() { return month; }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) this.month = month;
    }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void displayDate() {
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        String[] months = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String mStr = (month >= 1 && month <= 12) ? months[month] : "Unk";
        return String.format("%02d %s %04d", day, mStr, year);
    }
}