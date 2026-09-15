package version2;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getMonth() { return month; }
    public void setMonth(int month) { this.month = month; }
    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
}