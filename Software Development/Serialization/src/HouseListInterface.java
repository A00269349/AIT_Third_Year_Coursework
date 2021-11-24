import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface HouseListInterface extends Remote{
	public void addToList(House h) throws RemoteException;
	public ArrayList<House> getList() throws RemoteException;
}
