package Assignment_3;

public class Staff
{
    private String firstName, lastName, department;
    /*CONSTRUCTOR*/
    public Staff(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    /*GETTERS*/
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDepartment() {
        return department;
    }
    /*SETTERS*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    /*TO STRING*/
    @Override
    public String toString() {
        String newline = "\n";
        return "*******************************" + newline + " STAFF FIRST NAME : " + firstName + newline + " STAFF LAST NAME  : " + lastName + newline + " STAFF DEPARTMENT : " + department;
    }
}
