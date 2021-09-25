import java.util.ArrayList;
public class ArrayList_Example
{
    private final ArrayList<ArrayList_Person> theListofPeople = new ArrayList();

    public ArrayList_Example() {
        theListofPeople.add(new ArrayList_Person("Michael", 877654321, "Dublin"));
        theListofPeople.add(new ArrayList_Person("Mary", 87123467, "Cork"));
        theListofPeople.add(new ArrayList_Person("Claire", 879654123, "Westmeath"));
        theListofPeople.add(new ArrayList_Person("John", 876541237, "Galway"));
    }

    public ArrayList_Person getRefForName(String pName) {
        //Because an ArrayList doesn't store tagged value
        //pairs you have to search the list for the customer
        for (ArrayList_Person p : theListofPeople) {
            if (p.getName().equals(pName)) {
                return p;
            }
        }
        return null;
    }
}

