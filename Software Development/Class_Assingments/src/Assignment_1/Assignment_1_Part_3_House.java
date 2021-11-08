package Assignment_1;
public class Assignment_1_Part_3_House
{
    int numberOfBedrooms, numberOfBathrooms;
    String ownersSurname;

    public Assignment_1_Part_3_House(int numberOfBedrooms, int numberOfBathrooms, String ownersSurname) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.ownersSurname = ownersSurname;
    }
    public Assignment_1_Part_3_House(int numberOfBedrooms, int numberOfBathrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.ownersSurname = null;
    }
    public Assignment_1_Part_3_House(int numberOfBedrooms, String ownersSurname) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = 0;
        this.ownersSurname = ownersSurname;
    }
    public Assignment_1_Part_3_House(String ownersSurname) {
        this.numberOfBedrooms = 0;
        this.numberOfBathrooms = 0;
        this.ownersSurname = ownersSurname;
    }
    public Assignment_1_Part_3_House() {
        this.numberOfBedrooms = 0;
        this.numberOfBathrooms = 0;
        this.ownersSurname = null;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public String getOwnersSurname() {
        return ownersSurname;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    public void setOwnersSurname(String ownersSurname) {
        this.ownersSurname = ownersSurname;
    }

    public void PrintDetails() {
        String output = "OWNERS: " + ownersSurname + " | NUMBER OF BEDROOM: " + numberOfBedrooms + " | NUMBER OF BATHROOMS: " + numberOfBathrooms;
        System.out.println(output);
    }
}