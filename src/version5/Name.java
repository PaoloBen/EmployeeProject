package version5;

import java.util.Objects;

public class Name implements Cloneable {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Name name = (Name) obj;
        return firstName.equalsIgnoreCase(name.firstName) &&
                middleName.equalsIgnoreCase(name.middleName) &&
                lastName.equalsIgnoreCase(name.lastName) &&
                suffix.equalsIgnoreCase(name.suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), middleName.toLowerCase(), lastName.toLowerCase(), suffix.toLowerCase());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}