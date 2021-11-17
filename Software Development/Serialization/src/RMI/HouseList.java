package RMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class HouseList extends UnicastRemoteObject implements HouseListInterface{

	private ArrayList<House> houses;
	
	public HouseList() throws RemoteException {
		houses= new ArrayList();
		// TODO Auto-generated constructor stub
	}
 	@Override
	public void addToList(House h) throws RemoteException {
		houses.add(h);
		
	}

	@Override
	public ArrayList<House> getList() throws RemoteException {
		// TODO Auto-generated method stub
		return houses;
	}

}
