package RMI;
import java.rmi.Naming;
import java.rmi.*;
public class HouseServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Server has started.....");
		
		try {
			House bungalow = new House("Smiths", "Dublin");
			System.out.println("bungalow created....");
			House dormer = new House("Burkes", "Kerry");
			System.out.println("dormer created...");
	
			HouseList hl = new HouseList();
			hl.addToList(bungalow);
			hl.addToList(dormer);
			
			
			Naming.rebind("listOfHouses", hl);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
