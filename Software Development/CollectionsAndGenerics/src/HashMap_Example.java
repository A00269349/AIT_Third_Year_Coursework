import java.util.HashMap;

public class HashMap_Example
{
	
	private final HashMap<String, HashMap_Person> theListofPeople = new HashMap();
	
	public HashMap_Example(){
		theListofPeople.put("Michael", new HashMap_Person("Michael", 877654321, "Dublin"));
		theListofPeople.put("Mary", new HashMap_Person("Mary", 87123467, "Cork"));
		theListofPeople.put("Claire", new HashMap_Person("Claire", 879654123, "Westmeath"));
		theListofPeople.put("John", new HashMap_Person("John", 876541237, "Galway"));
	}
	
	public HashMap_Person getRefForName(String name){
		// You can use the key to access the object directly without searching
		return theListofPeople.get(name);		
	}
}

