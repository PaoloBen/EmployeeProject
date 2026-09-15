package version2;

public class Name {
    private String firstName;
    private String middName;
    private String lastName;
    private String suffix;

    public Name() {
        this.firstName = "N/A";
        this.middName = "N/A";
        this.lastName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String middName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middName = middName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMiddName() { return middName; }
    public void setMiddName(String middName) { this.middName = middName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSuffix() { return suffix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }

    @Override
    public String toString() {
        String mi = (middName != null && !middName.equals("N/A") && !middName.isEmpty()) ? middName.charAt(0) + "." : "";
        String suf = (suffix != null && !suffix.isEmpty()) ? " " + suffix : "";
        return String.format("%s, %s %s%s", lastName, firstName, mi, suf).trim();
    }
}