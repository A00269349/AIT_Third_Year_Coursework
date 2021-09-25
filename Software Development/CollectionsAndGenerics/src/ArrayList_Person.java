public class ArrayList_Person
{

    private String name;
    private final String address;
    private final long phoneNumber;

    public ArrayList_Person() {
        this.name = null;
        this.address = null;
        this.phoneNumber = 0;
    }

    public ArrayList_Person(String name, long number, String address) {
        this.name = name;
        this.address = address;
        this.phoneNumber = number;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void printDetails() {
        System.out.println("name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("**********************************");
    }
}
