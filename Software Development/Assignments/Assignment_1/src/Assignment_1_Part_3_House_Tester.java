public class Assignment_1_Part_3_House_Tester
{
    public static void main(String[] args) {
        Assignment_1_Part_3_House house_1_non_empty_constructor = new Assignment_1_Part_3_House(12, 31, "Alonso");
        Assignment_1_Part_3_House house_2_non_empty_constructor = new Assignment_1_Part_3_House(13,12, "Benjamin");
        Assignment_1_Part_3_House house_1_empty_constructor = new Assignment_1_Part_3_House();

        house_1_empty_constructor.setNumberOfBathrooms(31);
        house_1_empty_constructor.setNumberOfBedrooms(354);
        house_1_empty_constructor.setOwnersSurname("WEST");

        house_1_non_empty_constructor.PrintDetails();
        house_2_non_empty_constructor.PrintDetails();
        house_1_empty_constructor.PrintDetails();
    }
}
