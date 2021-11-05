import java.io.Serializable;

public class Staff implements Serializable {
    private String staffID;
    private String name;
    private String address;
    private int salary;

    public Staff(String id, String n, String a, int s) {
        this.staffID = id;
        this.name = n;
        this.address = a;
        this.salary = s;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
