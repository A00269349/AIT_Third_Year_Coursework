public class HashMap_Tester
{
	
	public static void main(String[] args){
		HashMap_Example hashMapExample = new HashMap_Example();
		
		HashMap_Person p = hashMapExample.getRefForName("Claire");
		
		p.printDetails();
	}
}



