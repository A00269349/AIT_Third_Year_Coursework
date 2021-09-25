public class ArrayList_Tester
{
    public static void main(String[] args) {
        ArrayList_Example aList = new ArrayList_Example();
        ArrayList_Person p = aList.getRefForName("Mary");
        p.printDetails();
    }
}



