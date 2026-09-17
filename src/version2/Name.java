package version2;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public Name() {
        this("N/A", "N/A", "N/A", "");
    }

    public Name(String firstName, String lastName) {
        this(firstName, "N/A", lastName, "");
    }

    public Name(String firstName, String middleName, String lastName) {
        this(firstName, middleName, lastName, "");
    }

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSuffix() { return suffix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }

    public void displayName() {
        System.out.print(this.toString());
    }

    @Override
    public String toString() {
        String mi = (middleName != null && !middleName.equals("N/A") && !middleName.isEmpty()) ? middleName.charAt(0) + "." : "";
        String suf = (suffix != null && !suffix.isEmpty()) ? " " + suffix : "";
        return String.format("%s, %s %s%s", lastName, firstName, mi, suf).trim();
    }
}