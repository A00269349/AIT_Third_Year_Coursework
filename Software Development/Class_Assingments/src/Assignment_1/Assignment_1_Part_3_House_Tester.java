package Assignment_1;
public class Assignment_1_Part_3_House_Tester
{
    public static void main(String[] args) {
        Assignment_1_Part_3_House house_1_non_empty_constructor = new Assignment_1_Part_3_House(5, 1, "Smith");
        Assignment_1_Part_3_House house_2_non_empty_constructor = new Assignment_1_Part_3_House(5,1, "Jones");
        Assignment_1_Part_3_House house_1_empty_constructor = new Assignment_1_Part_3_House();

        house_1_empty_constructor.setNumberOfBathrooms(4);
        house_1_empty_constructor.setNumberOfBedrooms(2);
        house_1_empty_constructor.setOwnersSurname("Burke");

        house_1_non_empty_constructor.PrintDetails();
        house_2_non_empty_constructor.PrintDetails();
        house_1_empty_constructor.PrintDetails();
    }
}
