import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CarListsInterface extends Remote
{
    public void addToList(Car h) throws RemoteException;
    public void removeFromList(int h) throws RemoteException;
    public void setList(Car h, int i) throws RemoteException;
    public int getListSize() throws RemoteException;
    public Car getIndex(int i) throws RemoteException;
    public ArrayList<Car> getList() throws RemoteException;
}
