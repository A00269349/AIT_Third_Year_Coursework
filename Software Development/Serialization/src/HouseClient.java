import java.rmi.Naming;
import java.util.ArrayList;


public class HouseClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="rmi:///"; //no IP address, this is local.
		try {
			HouseListInterface houseList = (HouseListInterface) Naming.lookup("listOfHouses");
			ArrayList<House> actualHouseList = houseList.getList();
			for(HouseInterface h : actualHouseList) {
				System.out.println(h.getOwners());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
